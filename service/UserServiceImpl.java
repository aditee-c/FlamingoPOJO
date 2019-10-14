package com.flamingo.service;

import com.flamingo.dao.UserDao;
import com.flamingo.dao.UserDaoImpl;
import com.flamingo.entities.UserLogin;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}

	@Override
	public UserLogin findUserById(int profileId) {

		return userDao.getById(profileId);
	}

	@Override
	public void addUser(UserLogin user) {
		userDao.insert(user);
	}

	@Override
	public void updateUser(UserLogin user) {
		userDao.update(user);

	}

}
