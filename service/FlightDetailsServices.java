package com.flamingo.service;

import java.util.List;

import com.flamingo.entities.FlightDetails;

public interface FlightDetailsServices {
	List<FlightDetails> findAllFlightDetails();

	FlightDetails findFlightDetailsByflightId(int flightId);

	void addFlightDetails(FlightDetails flightdetails);

	void updateFlightDetails(FlightDetails flightdetails);

	void removeFlightDetails(FlightDetails flightdetails);
}
