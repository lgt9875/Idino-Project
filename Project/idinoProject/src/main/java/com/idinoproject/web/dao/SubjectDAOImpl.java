package com.idinoproject.web.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.SubjectModel;
import com.idinoproject.web.model.TakingSubjectModel;
import com.idinoproject.web.model.UserModel;

@Repository
public class SubjectDAOImpl implements SubjectDAO{
	private static final String NAMESPACE = "com.idinoproject.web.subjectMapper.";
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<TakingSubjectModel> getTakingSubjectList(int ts_Sid) throws Exception{
		
		List<Object> takingSubject = sqlSession.selectList(NAMESPACE+"getTakingSubjectList",ts_Sid);
		System.out.println(takingSubject);
//		return sqlSession.selectOne(NAMESPACE+"login",usermodel);	
		
		
		return sqlSession.selectList(NAMESPACE+"getTakingSubjectList",ts_Sid);
	}
}
