package com.idinoproject.web.dto;

public class LoginDto {
	public int S_Num;
	public String Password;
	public boolean useCookie;
	
	
	public int getS_Num() {
		return S_Num;
	}
	public void setS_Num(int s_Num) {
		S_Num = s_Num;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public boolean isUseCookie() {
		return useCookie;
	}
	public void setUseCookie(boolean useCookie) {
		this.useCookie = useCookie;
	}
	
	
}
