package com.flamingo.dao;

import com.flamingo.entities.UserLogin;

public interface UserDao {
	UserLogin getById(int profileId);

	void insert(UserLogin user);

	void update(UserLogin user);

	

}