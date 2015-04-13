package com.tradingapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tradingapp.dao.ILoginDao;
import com.tradingapp.dto.User;

@Service("loginService")
public class LoginService implements ILoginService {

	@Autowired
	private ILoginDao loginDao;

	@Transactional
	public boolean authenticateUser(User user) {
		return loginDao.authenticateUser(user);
	}

}
