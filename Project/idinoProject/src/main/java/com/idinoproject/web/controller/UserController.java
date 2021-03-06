package com.idinoproject.web.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.mapping.ResultMap;
import org.mindrot.jbcrypt.BCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.idinoproject.web.commons.interceptor.LoginInterceptor;
import com.idinoproject.web.dto.CheckDto;
import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.CheckingModel;
import com.idinoproject.web.model.SubjectModel;
import com.idinoproject.web.model.TakingSubjectModel;
import com.idinoproject.web.model.UserModel;
import com.idinoproject.web.service.SubjectService;
import com.idinoproject.web.service.UserService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Inject
	private UserService userService;
	@Inject
	private SubjectService subjectService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	//화면 선택 
	@RequestMapping(value = "/choice",method = RequestMethod.GET)
	public String choice(LoginDto loginDto, HttpSession httpSession, Model model,HttpServletRequest request) throws Exception	{
		UserModel userModel = (UserModel) httpSession.getAttribute("login"); 
		int sid = userModel.getSid();
		if(userModel.getPosition().equals("학생")) {
			model.addAttribute("takingSubjectList", subjectService.getTakingSubjectList(sid));
			return "user/main";
		}
		else if(userModel.getPosition().equals("관리자")) {
			model.addAttribute("comboManageSubjectList", subjectService.getManageComboSubjectList());
			model.addAttribute("managementList", subjectService.getManagementList(""));
			return "user/manager";
		}
		return null;
	}
	
	
	@RequestMapping(value = "/chekcing",method = RequestMethod.GET)
	public String checking(Model model, @Param("s_id") String s_id)throws Exception	{
		model.addAttribute("comboSubjectList", subjectService.getComboSubjectList(Integer.parseInt(s_id)));
		model.addAttribute("checkingList", subjectService.getCheckingSearchInfo(s_id,""));
		return "checking";	
	}

	//출석체크 현황 리턴
	@ResponseBody
	@RequestMapping(value = "/checking",method = RequestMethod.POST)
	public String checking(@Param("s_id") String s_id,
			@Param("SubjectCode") String SubjectCode,
			@Param("SubjectName") String SubjectName,
			@Param("Status") String Status) throws Exception{
		subjectService.getChecking(s_id,SubjectCode,SubjectName,Status);
		return "user/main";
	}
		
	//회원가입 이동
	@RequestMapping("/join")
	public String UserJoin() {
		return "join";
	}
	
	//회원가입
	@RequestMapping(value = "/saveUserInfo",method = RequestMethod.POST)
	public String saveUserInfo(@ModelAttribute("UserModel") UserModel userModel, RedirectAttributes rttr) throws Exception{
		userService.insertUser(userModel);
		return "redirect:/user/login";
	}
	
	//로그인 페이지로 돌아감
	@RequestMapping(value = "/login")
	public String loginGET() {
		return "login";
	}
	
	//로그인 비번 확인
	@RequestMapping(value="/loginPost",method = RequestMethod.POST)
	public void loginPost(LoginDto loginDto, HttpSession httpSession, Model model) throws Exception	{
		UserModel userModel = userService.login(loginDto);
		if(userModel == null || !BCrypt.checkpw(loginDto.getPassword(), userModel.getPassword())) {
			return;
		}
		model.addAttribute("user",userModel);
	}
	
	
	//로그아웃
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		logger.info("logout success");
		ModelAndView mv = new ModelAndView("redirect:/user/login");
		return mv;
	}
	
	
	//QRCode
	@RequestMapping("/createCode")
	public ModelAndView createCode(@RequestParam String content){
	    return new ModelAndView("qrcodeview", "content", content);
	}
	
	
	//출석체크
	@RequestMapping(value = "/saveStateInfo",method = RequestMethod.POST)
	public String saveStateInfo(@ModelAttribute("UserModel") UserModel userModel, RedirectAttributes rttr) throws Exception{
		userService.insertUser(userModel);
		return "redirect:/user/login";
	}
		
	//출석체크화면
	@RequestMapping(value = "/getCheckingInfo",method = RequestMethod.GET)
	public String getCheckingInfo(LoginDto loginDto, Model model,
			@Param("s_id") String s_id,
			@Param("SubjectName") String SubjectName,
			@Param("Position") String Position) throws Exception{
		if(Position.equals("학생")) {
			model.addAttribute("comboSubjectList", subjectService.getComboSubjectList(Integer.parseInt(s_id)));
			model.addAttribute("checkingList", subjectService.getCheckingSearchInfo(s_id,SubjectName));
			return "checking";	
		}
		else if(Position.equals("관리자")) {
			model.addAttribute("comboManageSubjectList", subjectService.getManageComboSubjectList());
			model.addAttribute("managementList", subjectService.getManagementList(SubjectName));
			return "user/manager";	
		}
		return null;
	}
	

	@ResponseBody
	@RequestMapping(value = "/getCheckingSearchInfo",method = RequestMethod.GET)
	public String getCheckingSearchInfo(LoginDto loginDto, Model model,
			@Param("s_id") String s_id,
			@Param("SubjectName") String SubjectName) throws Exception{

		List<CheckingModel> list = subjectService.getCheckingSearchInfo(s_id,SubjectName);
		JSONArray jsonArray = new JSONArray();
		
		model.addAttribute("checkingSearchList",jsonArray.fromObject(list));
		return "checking";
	}
}
