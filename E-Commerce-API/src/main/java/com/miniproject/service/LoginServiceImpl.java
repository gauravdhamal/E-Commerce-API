package com.miniproject.service;

import javax.security.auth.login.LoginException;

import com.miniproject.model.AdminLogin;
import com.miniproject.model.CustomerLogin;

public class LoginServiceImpl implements LoginService {

	@Override
	public String loginAsCustomer(CustomerLogin customerDto) throws LoginException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logoutAsCustomer(String key) throws LoginException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loginAsAdmin(AdminLogin adminDto) throws LoginException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logoutAsAdmin(String key) throws LoginException {
		// TODO Auto-generated method stub
		return null;
	}

}
