package com.flamingo.entities;

import java.util.List;

import com.flamingo.entities.Passenger;


public interface PassengerDao {
	
	List<Passenger> getAll();

	Passenger getById(int  profileId);

	void insert(Passenger passenger);

	void update(Passenger passenger);

	void delete(Passenger passenger);
	

}
