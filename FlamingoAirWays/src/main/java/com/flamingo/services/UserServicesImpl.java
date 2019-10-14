package com.flamingo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.flamingo.dao.UserDao;
import com.flamingo.dao.UserDaoImpl;
import com.flamingo.entities.UserLogin;

@Service
@Transactional
public class UserServicesImpl implements UserServices {
	@Autowired
	private UserDao userDao;

	public UserServicesImpl() {
		userDao = new UserDaoImpl();
	}

	@Override
	public UserLogin findUserById(@PathVariable("id") int profileId) {

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
