package com.flamingo.entities;

import java.util.List;

import com.flamingo.entities.Passenger;
/**
 * @author CHARAN R
 * @creation date: 4th oct 2019 10:23am
 * @modification date: 4th oct 2019 10:23am
 * @version 1.0
 * @copyright Zensar technologies ltd, all rights reserved
 *
 */


public interface PassengerDao {
	
	List<Passenger> getAll();

	Passenger getById(int  profileId);

	void insert(Passenger passenger);

	void update(Passenger passenger);

	void delete(Passenger passenger);
	

}
