package com.flamingo.services;
/**
 * @author CHARAN R
 * @creation date: 4th oct 2019 10:23am
 * @modification date: 4th oct 2019 10:23am
 * @version 1.0
 * @copyright Zensar technologies ltd, all rights reserved
 *
 */

import java.util.List;

import com.flamingo.entities.Passenger;


public interface PassengerService {

	List<Passenger> SeeAllPassengers();  //admin
	
	void addPassenger(Passenger passenger); //passenger
	
	void removePassenger(Passenger passenger); //admin
	
	void updatePassenger(Passenger passenger);  //passenger
	
	Passenger findPassengersById(int passengerId);

}
