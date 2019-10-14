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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flamingo.dao.PassengerDaoImpl;
import com.flamingo.entities.Passenger;
import com.flamingo.entities.PassengerDao;

@Service
@Transactional
public class PassengerServiceImpl implements PassengerService {
	@Autowired
	private PassengerDao passengerDao;
	
	public PassengerServiceImpl() {
		// TODO Auto-generated constructor stub
		passengerDao=new PassengerDaoImpl();
	}

	public List<Passenger> SeeAllPassengers() {
		// TODO Auto-generated method stub
		
		return passengerDao.getAll();
	}

	public void addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		passengerDao.insert(passenger);
	}

	public void removePassenger(Passenger passenger) { 
		// TODO Auto-generated method stub
		 passengerDao.delete(passenger);

	}

	public void updatePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		passengerDao.update(passenger);

	}

	@Override
	public Passenger findPassengersById(int passengerId) {
		// TODO Auto-generated method stub
		return passengerDao.getById(passengerId);
	}

}
	// TODO Auto-generated method stub
	

