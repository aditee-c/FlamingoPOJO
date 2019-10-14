package com.zensar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.FlightDetailsDao;
import com.zensar.entities.FlightDetails;

@Service
public class FlightDetailsServiceImpl implements FlightDetailService {
	@Autowired
	private FlightDetailsDao flightdetailsDao;
	
	@Override
	public List<FlightDetails> findAllFlightDetails() {
		// TODO Auto-generated method stub
		return flightdetailsDao.getAll();
	}

	@Override
	public FlightDetails findFlightDetailsByflightId(int flightId) {
		// TODO Auto-generated method stub
		return flightdetailsDao.getByflightId(flightId);
	}

	@Override
	public void addFlightDetails(FlightDetails flightdetails) {
		// TODO Auto-generated method stub
		flightdetailsDao.insert(flightdetails);
		
	}

	@Override
	public void updateFlightDetails(FlightDetails flightdetails) {
		// TODO Auto-generated method stub
		flightdetailsDao.update(flightdetails);
	}

	@Override
	public void removeFlightDetails(FlightDetails flightdetails) {
		// TODO Auto-generated method stub
		flightdetailsDao.delete(flightdetails);
	}

}
