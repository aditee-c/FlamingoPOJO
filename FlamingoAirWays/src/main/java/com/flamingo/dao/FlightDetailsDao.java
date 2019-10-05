package com.flamingo.dao;

import java.util.List;

import com.flamingo.entities.FlightDetails;

public interface FlightDetailsDao {
	List<FlightDetails> getAll();

	void insert(FlightDetails flightdetails);

	void update(FlightDetails flightdetails);

	void delete(FlightDetails flightdetails);

	FlightDetails getByflightId(int flightId);

}
