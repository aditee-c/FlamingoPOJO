package com.zensar.service;

import java.util.List;

import com.zensar.dao.FlightDetailsDao;
import com.zensar.dao.FlightDetailsDaoImpl;
import com.zensar.entities.FlightDetails;

public class FlightDetailsServiceImpl implements FlightDetailsService {
    private FlightDetailsDao flightdetailsDao;
    
    public FlightDetailsServiceImpl() {
		// TODO Auto-generated constructor stub
    	flightdetailsDao = new FlightDetailsDaoImpl();
    }
			
			
	public List<FlightDetails> findAllFlightDetails() {
		// TODO Auto-generated method stub
		return flightdetailsDao.getAll();
	}

	public FlightDetails findFlightDetailsByflightId(int flightId) {
		// TODO Auto-generated method stub
		return flightdetailsDao.getByflightId(flightId);
	}

	public void addFlightDetails(FlightDetails flightdetails) {
		// TODO Auto-generated method stub
		flightdetailsDao.insert(flightdetails);
           
	}

	public void updateFlightDetails(FlightDetails flightdetails) {
		// TODO Auto-generated method stub
           flightdetailsDao.update(flightdetails);
	}

	public void removeFlightDetails(FlightDetails flightdetails) {
		// TODO Auto-generated method stub
         flightdetailsDao.delete(flightdetails);
	}

}
