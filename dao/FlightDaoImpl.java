package com.flamingo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.flamingo.entities.Flight;


public class FlightDaoImpl implements FlightDao {
	private Session session;
	public FlightDaoImpl() {
		Configuration c = new Configuration().configure();
		SessionFactory sf = c.buildSessionFactory();
		session= sf.openSession();
	}

	public List<Flight> getAll() {
		// TODO Auto-generated method stub
		return session.createQuery("from Flight").getResultList();
	}

	public Flight getById(int flightid) {
		// TODO Auto-generated method stub
		return session.get(Flight.class, flightid);
	}

	public void insert(Flight flight) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.save(flight);
		t.commit();
		
	}

	public void update(Flight flight) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.update(flight);
		t.commit();
		
	}

	public void delete(Flight flight) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.delete(flight);
		t.commit();
		
	}

}
