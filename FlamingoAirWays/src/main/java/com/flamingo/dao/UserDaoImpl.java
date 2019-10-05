package com.flamingo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.flamingo.entities.UserLogin;

public class UserDaoImpl implements UserDao {
	private Session session;

	public UserDaoImpl() {
		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		session = sf.openSession();
	}

	@Override
	public void insert(UserLogin user) {
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();

	}

	@Override
	public void update(UserLogin user) {
		Transaction tx = session.beginTransaction();
		session.update(user);
		tx.commit();

	}

	

	@Override
	public UserLogin getById(int profileId) {

		return session.get(UserLogin.class, profileId);
	}

}