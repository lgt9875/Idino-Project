package com.idinoproject.web.dto;

public class CheckDto {
	private String s_id;
	private String SubjectCode;
	private String SubjectName;
	private String checkStatus;
	private String status;
	
	
	
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getSubjectCode() {
		return SubjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		SubjectCode = subjectCode;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	
	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
