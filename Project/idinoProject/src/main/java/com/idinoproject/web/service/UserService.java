package com.idinoproject.web.service;

import java.util.List;

import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.UserModel;

public interface UserService {
	public List<UserModel> getUserInfo() throws Exception;
	
	public void insertUser(UserModel userModel) throws Exception;
	
	public UserModel login(LoginDto loginDto) throws Exception;
}
