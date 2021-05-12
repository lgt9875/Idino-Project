package com.idinoproject.web.controller;

import java.util.Enumeration;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.mindrot.jbcrypt.BCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.idinoproject.web.commons.interceptor.LoginInterceptor;
import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.TakingSubjectModel;
import com.idinoproject.web.model.UserModel;
import com.idinoproject.web.service.SubjectService;
import com.idinoproject.web.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Inject
	private UserService userService;
	@Inject
	private SubjectService subjectService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	//���� ��� ���
	@RequestMapping(value = "/choice",method = RequestMethod.GET)
	public String choice(){
		return "user/choice";
		
	}

	//���� ��� ���
	@RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
	public String getUserInfo(LoginDto loginDto,Model model) throws Exception{
		model.addAttribute("takingSubjectList", subjectService.getTakingSubjectList(loginDto.getSid()));
		return "user/main";
		
	}
		
	//ȸ������ȭ��
	@RequestMapping("/join")
	public String UserJoin() {
		return "join";
	}
	
	//ȸ������ ó��
	@RequestMapping(value = "/saveUserInfo",method = RequestMethod.POST)
	public String saveUserInfo(@ModelAttribute("UserModel") UserModel userModel, RedirectAttributes rttr) throws Exception{
		userService.insertUser(userModel);
		return "redirect:/user/login";
	}
	
	//�α���ȭ��
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String loginGET(@ModelAttribute("loginDTO") LoginDto loginDTO) {
		return "login";
	}
	
	//�α���ó��
	@RequestMapping(value="/loginPost",method = RequestMethod.POST)
	public void loginPost(LoginDto loginDto, HttpSession httpSession, Model model) throws Exception	{
		UserModel userModel = userService.login(loginDto);
		if(userModel == null || !BCrypt.checkpw(loginDto.getPassword(), userModel.getPassword())) {
			return;
		}
		model.addAttribute("user",userModel);
	}
	
	
	//�α׾ƿ�
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
	    //ModelAndView �ٷ� ����
	    return new ModelAndView("qrcodeview", "content", content);
	}
}