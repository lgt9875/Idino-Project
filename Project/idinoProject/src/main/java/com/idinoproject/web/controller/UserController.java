package com.idinoproject.web.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.UserModel;
import com.idinoproject.web.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Inject
	private UserService userService;
	
	//유저 목록 출력
	@RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
	public String getUserInfo(Model model) throws Exception{
		model.addAttribute("userInfo", userService.getUserInfo());
		
		return "user/user";
		
	}
	
	//회원가입화면
	@RequestMapping("/join")
	public String UserJoin() {
		return "join";
	}
	
	//회원가입 처리
	@RequestMapping(value = "/saveUserInfo",method = RequestMethod.POST)
	public String saveUserInfo(@ModelAttribute("UserModel") UserModel userModel, RedirectAttributes rttr) throws Exception{
		userService.insertUser(userModel);
		return "redirect:/user/getUserInfo";
	}
	
	//로그인화면
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String loginGET(@ModelAttribute("loginDTO") LoginDto loginDTO) {
		return "login";
	}
	
	//로그인처리
	@RequestMapping(value="/loginPost",method = RequestMethod.POST)
	public void loginPost(LoginDto loginDto, HttpSession httpSession, Model model) throws Exception	{
		UserModel userModel = userService.login(loginDto);
		
		if(userModel == null || !BCrypt.checkpw(loginDto.getPassword(), userModel.getPassword())) {
			return;
		}
		model.addAttribute("user",userModel);
	}
	
	
}
