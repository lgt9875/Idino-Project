package com.idinoproject.web.dao;

import java.util.List;


import com.idinoproject.web.model.UserModel;


public interface UserDAO {
	public List<UserModel> getUserInfo() throws Exception;
}
