package com.idinoproject.web.dto;

public class ManagementDto {
	int m_sid;
	String m_subName;
	String m_checkingTime;
	String m_state;
	
	int m_attendance;
	int m_lateness;
	int m_absence;
	
	public int getM_sid() {
		return m_sid;
	}
	public void setM_sid(int m_sid) {
		this.m_sid = m_sid;
	}
	
	public String getM_subName() {
		return m_subName;
	}
	public void setM_subName(String m_subName) {
		this.m_subName = m_subName;
	}
	
	public String getM_checkingTime() {
		return m_checkingTime;
	}
	public void setM_checkingTime(String m_checkingTime) {
		this.m_checkingTime = m_checkingTime;
	}
	public String getM_state() {
		return m_state;
	}
	public void setM_state(String m_state) {
		this.m_state = m_state;
	}
	public int getM_attendance() {
		return m_attendance;
	}
	public void setM_attendance(int m_attendance) {
		this.m_attendance = m_attendance;
	}
	public int getM_lateness() {
		return m_lateness;
	}
	public void setM_lateness(int m_lateness) {
		this.m_lateness = m_lateness;
	}
	public int getM_absence() {
		return m_absence;
	}
	public void setM_absence(int m_absence) {
		this.m_absence = m_absence;
	}
	
	
	
}
