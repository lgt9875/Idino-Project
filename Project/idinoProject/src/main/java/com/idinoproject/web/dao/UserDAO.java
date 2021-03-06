package com.idinoproject.web.dao;

import java.util.List;
import java.util.Map;

import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.UserModel;


public interface UserDAO {
	public List<UserModel> getUserInfo() throws Exception;

	public void insertUser(UserModel userModel) throws Exception;
	
	public UserModel login(LoginDto loginDto) throws Exception;


}
