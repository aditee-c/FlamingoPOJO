package com.zensar.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.FlightDetails;

public class FlightDetailsDaoImpl implements FlightDetailsDao {
          private Session session;
          public FlightDetailsDaoImpl() {
			// TODO Auto-generated constructor stub
        	  Configuration c = new Configuration().configure();
        	  SessionFactory f = c.buildSessionFactory();
        	  Session s = f.openSession();
		}
	public List<FlightDetails> getAll() {
		// TODO Auto-generated method stub
		
		return session.createQuery("from flightdetails").getResultList();
	}

	public void insert(FlightDetails flightdetails) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.save(flightdetails);
		t.commit();

	}

	public void update(FlightDetails flightdetails) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.update(flightdetails);
		t.commit();

	}

	public void delete(FlightDetails flightdetails) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.delete(flightdetails);
		t.commit();
		

	}
	public FlightDetails getByflightId(int flightId) {
		// TODO Auto-generated method stub
		return session.get(FlightDetails.class,flightId);
	}
	

}
