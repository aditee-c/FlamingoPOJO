package com.flamingo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.flamingo.entities.UserLogin;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	

	

	@Override
	public void insert(UserLogin user) {
		 hibernateTemplate.save(user);

	}

	@Override
	public void update(UserLogin user) {
		hibernateTemplate.update(user);
	}

	

	@Override
	public UserLogin getById(int profileId) {
		
		return hibernateTemplate.get(UserLogin.class,profileId);
	}
		
	
}
