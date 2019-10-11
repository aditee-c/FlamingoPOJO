package com.flamingo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.flamingo.entities.Flight;

@Repository
public class FlightDaoImpl implements FlightDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Flight> getAll() {
		// TODO Auto-generated method stub
		return (List<Flight>) hibernateTemplate.find("from Flight");
	}

	@Override
	public Flight getById(long flightid) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Flight.class, flightid);
	}

	@Override
	public void insert(Flight flight) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(flight);
	}

	@Override
	public void update(Flight flight) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(flight);
	}

	@Override
	public void delete(Flight flight) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(flight);
	}
	
}
