package com.zensar.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.zensar.entities.FlightDetails;

@Repository
public class FlightDetailsDaoImpl implements FlightDetailsDao {
	@Autowired
	private HibernateTemplate hibernateTemplate; 

	@Override
	public List<FlightDetails> getAll() {
		// TODO Auto-generated method stub
		return (List<FlightDetails>) hibernateTemplate.find("from FlightDetails");
	}

	@Override
	public void insert(FlightDetails flightdetails) {
		// TODO Auto-generated method stub
              hibernateTemplate.save(flightdetails);
	}

	@Override
	public void update(FlightDetails flightdetails) {
		// TODO Auto-generated method stub
            hibernateTemplate.update(flightdetails);
	}

	@Override
	public void delete(FlightDetails flightdetails) {
		// TODO Auto-generated method stub
            hibernateTemplate.delete(flightdetails);
	}

	@Override
	public FlightDetails getByflightId(int flightId) {
		// TODO Auto-generated method stub
		
		return hibernateTemplate.get(FlightDetails.class, flightId);
	}

}
