package com.flamingo.service;

import com.flamingo.entities.UserLogin;

public interface UserServices {

	UserLogin findUserById(int profileId);

	void addUser(UserLogin user);

	void updateUser(UserLogin user);

}