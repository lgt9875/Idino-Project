package com.idinoproject.web.dao;

import java.util.List;

import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.SubjectModel;
import com.idinoproject.web.model.TakingSubjectModel;

public interface SubjectDAO {
	public List<TakingSubjectModel> getTakingSubjectList(int ts_Sid) throws Exception;
}