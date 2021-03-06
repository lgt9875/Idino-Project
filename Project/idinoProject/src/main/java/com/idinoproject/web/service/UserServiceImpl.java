package com.idinoproject.web.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.idinoproject.web.dao.UserDAO;
import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.UserModel;

@Repository
public class UserServiceImpl implements UserService {
	@Inject
	private UserDAO userDao;
	
	@Override
	public List<UserModel> getUserInfo() throws Exception {
		return userDao.getUserInfo();
	}

	@Override
	public void insertUser(UserModel userModel) throws Exception {
		userDao.insertUser(userModel);
	}
	
	@Override
	public UserModel login(LoginDto loginDto) throws Exception{
		return userDao.login(loginDto);
	}
	

}
