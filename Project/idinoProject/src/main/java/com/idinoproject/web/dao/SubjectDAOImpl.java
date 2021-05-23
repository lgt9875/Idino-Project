package com.idinoproject.web.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.idinoproject.web.dto.CheckDto;
import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.model.CheckingModel;
import com.idinoproject.web.model.SubjectModel;
import com.idinoproject.web.model.TakingSubjectModel;
import com.idinoproject.web.model.UserModel;

@Repository
public class SubjectDAOImpl implements SubjectDAO{
	private static final String NAMESPACE = "com.idinoproject.web.subjectMapper.";
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<TakingSubjectModel> getComboSubjectList(int ts_Sid)throws Exception{
		return sqlSession.selectList(NAMESPACE+"getComboTakingSubjectList",ts_Sid);
	}
	
	@Override
	public List<TakingSubjectModel> getTakingSubjectList(int ts_Sid) throws Exception{
		return sqlSession.selectList(NAMESPACE+"getTakingSubjectList",ts_Sid);
	}

	@Override
	public List<TakingSubjectModel> getChecking(@Param("s_id") String s_id,
			@Param("SubjectCode") String SubjectCode,
			@Param("SubjectName") String SubjectName,
			@Param("Status") String Status) throws Exception {
		CheckDto checkdto = new CheckDto();
		String status = null;
		
		checkdto.setS_id(s_id);
		checkdto.setSubjectCode(SubjectCode);
		checkdto.setSubjectName(SubjectName);
		checkdto.setStatus(Status);
		
		List<TakingSubjectModel> checking = sqlSession.selectList(NAMESPACE+"getChecking",checkdto);
		List<TakingSubjectModel> latecheCking = sqlSession.selectList(NAMESPACE+"getLateChecking",checkdto);
		List<TakingSubjectModel> absenceChecking = sqlSession.selectList(NAMESPACE+"getabsenceChecking",checkdto);
		
		if(!checking.isEmpty() && latecheCking.isEmpty() && absenceChecking.isEmpty()) {
			//20전
//			checkdto.setCheckStatus("출석");
			status = "출석";
		}else if (checking.isEmpty() && !latecheCking.isEmpty() && absenceChecking.isEmpty()) {
			//20분 후
//			checkdto.setCheckStatus("지각");
			status = "지각";
		}else  if(checking.isEmpty() && latecheCking.isEmpty() && !absenceChecking.isEmpty()) {
//			checkdto.setCheckStatus("결석");
			status = "결석";
		}
		checkdto.setCheckStatus(status);
		sqlSession.update(NAMESPACE+"updateChecking",checkdto);
		
		
		List<CheckingModel>checkingList = sqlSession.selectList(NAMESPACE+"getDateCheckingSearch",checkdto);
		
		if(checkingList.isEmpty()) {
			System.out.println("asdfasdfasdfassdf");
			CheckingModel checkModel = new CheckingModel();
			List<SubjectModel>subjectList = sqlSession.selectList(NAMESPACE+"getSubjectDate",SubjectCode);
			checkModel.setC_sid(Integer.parseInt(s_id));
			checkModel.setC_SubjectName(SubjectName);
			checkModel.setcS_time(subjectList.get(0).getS_time());
			checkModel.setcE_time(subjectList.get(0).getE_time());
			checkModel.setC_yoil(subjectList.get(0).getS_yoil());
			checkModel.setC_state(status);
			
			sqlSession.insert(NAMESPACE+"saveCheckingInfo",checkModel);
		}else {
			System.out.println("1111111111111");
			sqlSession.insert(NAMESPACE+"updateCheckingData",checkdto);
		}
		
		System.out.println(checking);
		return sqlSession.selectList(NAMESPACE+"getTakingSubjectList",Integer.parseInt(checkdto.getS_id()));
		
		
//		return sqlSession.selectList(NAMESPACE+"getChecking",s_id,subjectCode,subjectName);
	}
	
	
	@Override
	public List<CheckingModel> getCheckingAll(int ts_Sid) throws Exception{
		
//		List<Object> takingSubject = sqlSession.selectList(NAMESPACE+"getTakingSubjectList",ts_Sid);
//		System.out.println(takingSubject);
//		return sqlSession.selectOne(NAMESPACE+"login",usermodel);	
		
		
		return sqlSession.selectList(NAMESPACE+"getCheckingAll",ts_Sid);
	}
	
	@Override
	public List<CheckingModel> getCheckingSearchInfo(@Param("s_id") String s_id,
			@Param("SubjectName") String SubjectName) throws Exception{
		CheckDto checkdto = new CheckDto();
		checkdto.setS_id(s_id);
		checkdto.setSubjectName(SubjectName);
		return sqlSession.selectList(NAMESPACE+"getCheckingSearch",checkdto);
	}
	
}
