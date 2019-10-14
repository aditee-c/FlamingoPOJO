package com.flamingo.service;

import java.util.List;

import com.flamingo.dao.FlightDetailsDao;
import com.flamingo.dao.FlightDetailsDaoImpl;
import com.flamingo.entities.FlightDetails;

public class FlightDetailsServicesImpl implements FlightDetailsServices {
    private FlightDetailsDao flightdetailsDao;
    
    public FlightDetailsServicesImpl() {
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
