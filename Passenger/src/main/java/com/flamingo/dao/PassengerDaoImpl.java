package com.flamingo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.flamingo.entities.Passenger;
import com.flamingo.entities.PassengerDao;

public class PassengerDaoImpl implements PassengerDao {
	private Session session;
	public PassengerDaoImpl() {
		// TODO Auto-generated constructor stub
		Configuration c = new Configuration().configure();
		SessionFactory fac = c.buildSessionFactory();
		session = fac.openSession();
	}

	public List<Passenger> getAll() {
		// TODO Auto-generated method stub
		
		 return session.createQuery("from Passenger").getResultList();
	}

	public Passenger getById(int profileId) {
		// TODO Auto-generated method stub
		return session.get(Passenger.class,profileId);
	}

	public void insert(Passenger passenger) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
        session.save(passenger);
        t.commit();

	}

	public void update(Passenger passenger) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
		session.update(passenger);
		t.commit();

	}

	public void delete(Passenger passenger) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
        session.delete(passenger);
        t.commit();

	}

}
