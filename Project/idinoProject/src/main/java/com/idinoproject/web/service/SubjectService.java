package com.idinoproject.web.service;

import java.util.List;

import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.TakingSubjectModel;

public interface SubjectService {
	public List<TakingSubjectModel> getTakingSubjectList(int i) throws Exception;
}