package com.idinoproject.web.model;

public class TakingSubjectModel {
	private int ts_sid;
	private String ts_code;
	private String ts_name;
	private String tsS_time;
	private String tsE_time;
	
	public int getTs_sid() {
		return ts_sid;
	}
	public void setTs_sid(int ts_sid) {
		this.ts_sid = ts_sid;
	}
	public String getTs_code() {
		return ts_code;
	}
	public void setTs_code(String ts_code) {
		this.ts_code = ts_code;
	}
	public String getTs_name() {
		return ts_name;
	}
	public void setTs_name(String ts_name) {
		this.ts_name = ts_name;
	}
	public String getTsS_time() {
		return tsS_time;
	}
	public void setTsS_time(String tsS_time) {
		this.tsS_time = tsS_time;
	}
	public String getTsE_time() {
		return tsE_time;
	}
	public void setTsE_time(String tsE_time) {
		this.tsE_time = tsE_time;
	}
}
