package com.idinoproject.web;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.idinoproject.web.dao.UserDAO;
import com.idinoproject.web.model.UserModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/dataSource-context.xml"
})
public class UserDaoTest {
	private static final Logger logger = LoggerFactory.getLogger(UserDaoTest.class);
	
	@Inject
	private UserDAO userDAO;
	
	@Test
	public void testGetUserInfo() throws Exception{
		List<UserModel> userInfo = userDAO.getUserInfo();
		
		logger.info("\n User Info \n");
		if(userInfo.size() > 0) {
			for(UserModel list : userInfo) {
				logger.info(list.getSid() + "/" + list.getName());
			}
		}else {
			logger.info("�����Ͱ� �����ϴ�.");
		}
	}
}