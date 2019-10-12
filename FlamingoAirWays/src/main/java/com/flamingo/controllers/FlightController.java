package com.flamingo.controllers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flamingo.dao.FlightDao;
import com.flamingo.entities.Flight;
import com.flamingo.services.FlightServices;

public class FlightController {
	@Autowired
	@Qualifier("flightdao")
	FlightDao flightdao;
	@Autowired
	private FlightServices flightService;

	@RequestMapping("/ListFlights.htm")
	public List<Flight> getAllFlights() {
		return flightService.findAllFlights();
	}

	@RequestMapping("/flight/{id}")
	public Flight flightById(@PathVariable("id") int flightid) {
		return flightService.findFlightById(flightid);
	}

	@PostMapping("/addFlight.htm")
	public String addFlight(@RequestParam("id") int flightId, @RequestParam("name") String flightName,
			@RequestParam("from") String fromLocation, @RequestParam("to") String toLocation,
			@RequestParam("depdate") LocalDate departureDate, @RequestParam("arrivaldate") LocalDate arrivalDate,
			@RequestParam("departuretime") LocalTime departureTime, @RequestParam("arrivaltime") LocalTime arrivalTime,
			@RequestParam("duration") float duration, @RequestParam("totalseats") int totalSeats) {
		Flight flight = new Flight(flightId, flightName, fromLocation, toLocation, departureDate, arrivalDate,
				departureTime, arrivalTime, duration, totalSeats);
		flightService.addFlight(flight);
		return "flight successfully added";
	}

	@PutMapping("/updateFlight.htm")
	public String updateFlight(@RequestBody Flight flight) {
		if (flightService.findFlightById(flight.getFlightId()) != null) {
			flightService.updateFlight(flight);
			return "Flight is Updated Successfully";
		} else {
			return "sorry flight not found";
		}
	}

	@DeleteMapping("/deleteFlights.htm")
	public String deleteFlight(@RequestBody Flight flight) {
		if (flightService.findFlightById(flight.getFlightId()) != null) {
			flightService.removeFlight(flight);
			return "Flight is deleted Successfully";
		} else {
			return "sorry flight not found";
		}
	}

	@RequestMapping("/flightbylocation")
	public List<Flight> flightBylocation(@RequestParam("from") String from, @RequestParam("to") String to) {
		return flightService.findFlightByLocation(from, to);
	}

	@RequestMapping("/flightbydate")
	public List<Flight> flightBydate(@RequestParam("bydate") LocalDate date) {
		return flightService.findFlightByDate(date);
	}

	@RequestMapping("/flightbycount")
	public Long countOfSeats() {
		return flightService.getCountOfSeats();
	}

}
