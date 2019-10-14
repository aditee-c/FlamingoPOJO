package com.zensar.services;

import java.util.List;

import com.zensar.entities.FlightDetails;

public interface FlightDetailService {
	   List<FlightDetails> findAllFlightDetails();
	   FlightDetails findFlightDetailsByflightId(int flightId);
	   void addFlightDetails(FlightDetails flightdetails);
	   void updateFlightDetails(FlightDetails flightdetails);
	   void removeFlightDetails(FlightDetails flightdetails);

}
