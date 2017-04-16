package com.java.service;

import org.springframework.stereotype.Service;

@Service
public class AccountProcessServiceImpl implements IAccountProcessService{

	@Override
	public boolean login(String strUserName, String strPassWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean register(String strUserName, String strPassWord, String strEmail, String strFName, String strLName,
			String strPhoneNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fogotPassword(String strEmail) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
