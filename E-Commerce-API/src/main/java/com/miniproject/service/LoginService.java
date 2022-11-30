package com.miniproject.service;

import javax.security.auth.login.LoginException;

import com.miniproject.model.AdminLogin;
import com.miniproject.model.CustomerLogin;

public interface LoginService {

	public String loginAsCustomer(CustomerLogin customerDto) throws LoginException;

	public String logoutAsCustomer(String key) throws LoginException;

	public String loginAsAdmin(AdminLogin adminDto) throws LoginException;

	public String logoutAsAdmin(String key) throws LoginException;

}
