package com.flamingo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.flamingo.entities.Admin;

public class AdminDaoImpl implements AdminDao {
	private Session session;
public AdminDaoImpl() {
	// TODO Auto-generated constructor stub
	Configuration c = new Configuration().configure();
	SessionFactory s = c.buildSessionFactory();
	session = s.openSession();
}
	public List<Admin> getAll() {
		// TODO Auto-generated method stub
		return session.createQuery("from Admin").getResultList();
		
	}

	public Admin getById(int adminId) {
		// TODO Auto-generated method stub
		return session.get(Admin.class,adminId);
	}

	public void insert(Admin admin) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
		session.save(admin);
		t.commit();
	}

	public void update(Admin admin) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
		session.update(admin);
		t.commit();
	}

	public void delete(Admin admin) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
		session.delete(admin);
		t.commit();
	}

}