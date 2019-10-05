package com.flamingo.dao;

import java.util.List;

import com.flamingo.entities.Flight;

public interface FlightDao {

	List<Flight> getAll();

	Flight getById(int flightid);

	void insert(Flight flight);

	void update(Flight flight);

	void delete(Flight flight);

}
