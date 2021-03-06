package com.flamingo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flamingo.dao.FlightDetailsDao;
import com.flamingo.entities.FlightDetails;
@Service
@Transactional
public class FlightDetailsServicesImpl implements FlightDetailsServices {
    @Autowired
	private FlightDetailsDao flightdetailsDao;
   
			
			
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
