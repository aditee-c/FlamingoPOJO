package com.flamingo.services;

import java.util.List;

import com.flamingo.entities.Passenger;

public interface PassengerService {

	List<Passenger> SeeAllPassenger();  //admin
	

	void addPassenger(Passenger passenger); //passenger
	
	void removePassenger(Passenger passenger); //admin
	
	void updatePassenger(Passenger passenger);  //passenger


	Passenger findPassengersById(int id);
	
	
}