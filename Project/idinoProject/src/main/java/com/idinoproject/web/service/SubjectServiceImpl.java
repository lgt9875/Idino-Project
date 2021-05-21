package com.idinoproject.web.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.mapping.ResultMap;
import org.springframework.stereotype.Repository;

import com.idinoproject.web.dao.SubjectDAO;
import com.idinoproject.web.dto.CheckDto;
import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.CheckingModel;
import com.idinoproject.web.model.SubjectModel;
import com.idinoproject.web.model.TakingSubjectModel;

@Repository
public class SubjectServiceImpl implements SubjectService{
	@Inject
	private SubjectDAO subjectDao;
	
	@Override
	public List<SubjectModel> getComboSubjectList(int i)throws Exception{
		return subjectDao.getComboSubjectList(i);
	}
	
	@Override
	public List<TakingSubjectModel> getTakingSubjectList(int ts_Sid) throws Exception{
		return subjectDao.getTakingSubjectList(ts_Sid);
	}

	@Override
	public List<TakingSubjectModel> getChecking(@Param("s_id") String s_id,
			@Param("SubjectCode") String SubjectCode,
			@Param("SubjectName") String SubjectName,
			@Param("Status") String Status) throws Exception {
		return subjectDao.getChecking(s_id,SubjectCode,SubjectName,Status);
	}
	
	
	@Override
	public List<CheckingModel> getCheckingAll(int ts_Sid) throws Exception{
		return subjectDao.getCheckingAll(ts_Sid);
	}
	
	@Override
	public List<CheckingModel> getCheckingSearchInfo(
			@Param("s_id") String s_id,
			@Param("SubjectName") String SubjectName) throws Exception{
		return subjectDao.getCheckingSearchInfo(s_id,SubjectName);
	}
}
