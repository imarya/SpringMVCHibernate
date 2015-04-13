package com.tradingapp.services;

import com.tradingapp.dto.User;

public interface ILoginService {

	public boolean authenticateUser(User user);

}
