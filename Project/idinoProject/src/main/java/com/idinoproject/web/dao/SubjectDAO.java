package com.idinoproject.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.mapping.ResultMap;

import com.idinoproject.web.dto.CheckDto;
import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.CheckingModel;
import com.idinoproject.web.model.ManagementModel;
import com.idinoproject.web.model.SubjectModel;
import com.idinoproject.web.model.TakingSubjectModel;

public interface SubjectDAO {
	public List<TakingSubjectModel> getComboSubjectList(int i)throws Exception;
	
	public List<TakingSubjectModel> getTakingSubjectList(int ts_Sid) throws Exception;
	public List<TakingSubjectModel> getChecking(@Param("s_id") String s_id,
			@Param("SubjectCode") String SubjectCode,
			@Param("SubjectName") String SubjectName,
			@Param("Status") String Status) throws Exception;
	
	public List<CheckingModel> getCheckingAll(int ts_Sid) throws Exception;
	public List<CheckingModel> getCheckingSearchInfo(
			@Param("s_id") String s_id,
			@Param("SubjectName") String SubjectName) throws Exception;
	
	
	public List<ManagementModel> getManagementList(@Param("m_subName") String m_subName)throws Exception;
	
	public List<SubjectModel> getManageComboSubjectList()throws Exception;
	
	
}
