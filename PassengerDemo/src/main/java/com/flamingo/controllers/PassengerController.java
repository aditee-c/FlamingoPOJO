package com.flamingo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flamingo.entities.Passenger;
import com.flamingo.services.PassengerService;


/**
 * @author CHARAN R
 * @creation date: 4th oct 2019 10:23am
 * @modification date: 4th oct 2019 10:23am
 * @version 1.0
 * @copyright Zensar technologies ltd, all rights reserved
 *
 */
@RestController
public class PassengerController {

	@Autowired
	private PassengerService passengerService;
    @GetMapping("/Passengers")
	public List <Passenger> getAllPassengers() {

		return passengerService.SeeAllPassengers();

	}
    
    
    @GetMapping("/Passengers/{id}")
    public Passenger getPassenger(@PathVariable("id") int passengerId) {

		return passengerService.findPassengersById(passengerId);

	}
    
    @PostMapping("/Passengers/add")
    public String add(@RequestBody Passenger passenger)
    {
    	passengerService.addPassenger(passenger);
    	return "new Passenger" +passenger.getProfileId()+"is added sucessfully";
    }
    
  
    
    @PutMapping("/Passenger/u"
    		+ "pdate")
	public String update(@RequestBody Passenger passenger) {
		if (passengerService.findPassengersById(passenger.getProfileId()) != null) {
			passengerService.updatePassenger(passenger);
			return " Passenger" + passenger.getProfileId() + "is updated sucessfully";
		} else {
			return " Passenger" + passenger.getProfileId() + "not found";
		}

	}
    @DeleteMapping("/Passenger/delete")
    public String delete(@RequestBody Passenger passenger) {
		if (passengerService.findPassengersById(passenger.getProfileId()) != null) {
			passengerService.removePassenger(passenger);;
			return " Passenger" + passenger.getProfileId() + "is deleted sucessfully";
		} else {
			return " Passenger" + passenger.getProfileId() + "not found";
		}

	}
}
