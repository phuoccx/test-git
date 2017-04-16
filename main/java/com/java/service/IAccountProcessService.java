package com.java.service;

public interface IAccountProcessService {
	public boolean login(String strUserName, String strPassWord);
	public boolean register(String strUserName,String strPassWord,String strEmail,String strFName,String strLName,String strPhoneNo);
	public boolean fogotPassword(String strEmail);
}
