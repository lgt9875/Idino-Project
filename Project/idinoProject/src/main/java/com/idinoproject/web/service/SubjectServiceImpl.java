package com.idinoproject.web.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.idinoproject.web.dao.SubjectDAO;
import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.SubjectModel;
import com.idinoproject.web.model.TakingSubjectModel;

@Repository
public class SubjectServiceImpl implements SubjectService{
	@Inject
	private SubjectDAO subjectDao;
	
	@Override
	public List<TakingSubjectModel> getTakingSubjectList(int ts_Sid) throws Exception{
		return subjectDao.getTakingSubjectList(ts_Sid);
	}
	

}