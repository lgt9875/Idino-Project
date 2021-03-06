package com.idinoproject.web.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.idinoproject.web.dto.CheckDto;
import com.idinoproject.web.dto.LoginDto;
import com.idinoproject.web.dto.ManagementDto;
import com.idinoproject.web.model.CheckingModel;
import com.idinoproject.web.model.ManagementModel;
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
		sqlSession.update(NAMESPACE+"changeCheckingTimeNull",ts_Sid);
		return sqlSession.selectList(NAMESPACE+"getTakingSubjectList",ts_Sid);
	}

	@Override
	public List<TakingSubjectModel> getChecking(@Param("s_id") String s_id,
			@Param("SubjectCode") String SubjectCode,
			@Param("SubjectName") String SubjectName,
			@Param("Status") String Status) throws Exception {
		CheckDto checkdto = new CheckDto();
		ManagementDto managementDto = new ManagementDto();
		String status = null;
		int m_attendance=0, m_lateness=0, m_absence =0;
		
		checkdto.setS_id(s_id);
		checkdto.setSubjectCode(SubjectCode);
		checkdto.setSubjectName(SubjectName);
		checkdto.setStatus(Status);
		
		managementDto.setM_sid(Integer.parseInt(s_id));
		managementDto.setM_subName(SubjectName);
		
		
		List<TakingSubjectModel> checking = sqlSession.selectList(NAMESPACE+"getChecking",checkdto);
		List<TakingSubjectModel> latecheCking = sqlSession.selectList(NAMESPACE+"getLateChecking",checkdto);
		List<TakingSubjectModel> absenceChecking = sqlSession.selectList(NAMESPACE+"getabsenceChecking",checkdto);
		
		if(!checking.isEmpty() && latecheCking.isEmpty() && absenceChecking.isEmpty()) {
			//20???
//			checkdto.setCheckStatus("??????");
			status = "??????";
			m_attendance=1; m_lateness=0; m_absence =0;
		}else if (checking.isEmpty() && !latecheCking.isEmpty() && absenceChecking.isEmpty()) {
			//20??? ???
//			checkdto.setCheckStatus("??????");
			status = "??????";
			m_attendance=0; m_lateness=1; m_absence =0;
		}else  if(checking.isEmpty() && latecheCking.isEmpty() && !absenceChecking.isEmpty()) {
//			checkdto.setCheckStatus("??????");
			status = "??????";
			m_attendance=0; m_lateness=0; m_absence =1;
		}else {
			status = "??????????????? ????????????.";
			m_attendance=0; m_lateness=0; m_absence =0;
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
			
			ManagementModel manageModel = new ManagementModel();
			manageModel.setM_sid(Integer.parseInt(s_id));
			manageModel.setM_subName(SubjectName);
			manageModel.setM_state(status);
			manageModel.setM_attendance(m_attendance);
			manageModel.setM_lateness(m_lateness);
			manageModel.setM_absence(m_absence);
			
			sqlSession.insert(NAMESPACE+"saveCheckingInfo",checkModel);
			sqlSession.insert(NAMESPACE+"saveManagementInfo",manageModel);
			
		}else {
			System.out.println("1111111111111");
			managementDto.setM_state(status);
			managementDto.setM_attendance(m_attendance);
			managementDto.setM_lateness(m_lateness);
			managementDto.setM_absence(m_absence);
			sqlSession.update(NAMESPACE+"updateCheckingData",checkdto);
			sqlSession.update(NAMESPACE+"updateManagementData",managementDto);
		}
		
		System.out.println(checking);
		return sqlSession.selectList(NAMESPACE+"getTakingSubjectList",Integer.parseInt(checkdto.getS_id()));
		
		
	}
	
	
	@Override
	public List<CheckingModel> getCheckingAll(int ts_Sid) throws Exception{
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
	
	@Override
	public List<ManagementModel> getManagementList(@Param("m_subCode") String m_subName)throws Exception{
		return sqlSession.selectList(NAMESPACE+"getManagementList",m_subName);
		
	}
	
	@Override
	public List<SubjectModel> getManageComboSubjectList()throws Exception{
		return sqlSession.selectList(NAMESPACE+"getSubjectList");
	}
	
}
