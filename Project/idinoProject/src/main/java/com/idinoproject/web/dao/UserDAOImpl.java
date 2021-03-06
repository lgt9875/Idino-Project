package com.idinoproject.web.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Repository;

import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.UserModel;

@Repository
public class UserDAOImpl implements UserDAO{

	private static final String NAMESPACE = "com.idinoproject.web.userMapper.";
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<UserModel> getUserInfo() throws Exception {
		return sqlSession.selectList(NAMESPACE+"getUserInfo");
		
	}
	
	@Override
	public void insertUser(UserModel userModel) throws Exception {
		int sid = userModel.getSid();
		String name = userModel.getName();
		String password = BCrypt.hashpw(userModel.getPassword(), BCrypt.gensalt());
		String email = userModel.getEmail();
		String address = userModel.getAddress();
		String phone = userModel.getPhone();
		String position = userModel.getPosition();
		
		name = name.replace("<", "&gt");
		name = name.replace(">", "&lg");
		
		email = email.replace("<", "&gt");
		email = email.replace(">", "&lg");
		
		address = address.replace("<", "&gt");
		address = address.replace(">", "&lg");
		
		phone = phone.replace("<", "&gt");
		phone = phone.replace(">", "&lg");
		
		position = position.replace("<", "&gt");
		position = position.replace(">", "&lg");
		
		name = name.replace(" ", "&ndsp;&ndsp;");
		email = email.replace(" ", "&ndsp;&ndsp;");
		address = address.replace(" ", "&ndsp;&ndsp;");
		phone = phone.replace(" ", "&ndsp;&ndsp;");
		position = position.replace(" ", "&ndsp;&ndsp;");
		
		userModel.setSid(sid);
		userModel.setName(name);
		userModel.setPassword(password);
		userModel.setEmail(email);
		userModel.setAddress(address);
		userModel.setPhone(phone);
		userModel.setPosition(position);
		
		sqlSession.insert(NAMESPACE+"saveUserInfo",userModel);
		
	}
	
	@Override
	public UserModel login(LoginDto loginDto) throws Exception{
		UserModel usermodel = sqlSession.selectOne(NAMESPACE+"login",loginDto);
		
		return sqlSession.selectOne(NAMESPACE+"login",usermodel);	
	}
	
}
