package com.tradingapp.dao;

import com.tradingapp.dto.User;

public interface ILoginDao {

	public boolean authenticateUser(User user);
}
