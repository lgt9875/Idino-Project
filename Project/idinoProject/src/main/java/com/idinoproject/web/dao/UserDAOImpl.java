package com.idinoproject.web.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.idinoproject.web.model.UserModel;

@Repository
public class UserDAOImpl implements UserDAO{

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<UserModel> getUserInfo() throws Exception {
		return sqlSession.selectList("com.idinoproject.web.userMapper.getUserInfo");
		
	}
	
	

}
