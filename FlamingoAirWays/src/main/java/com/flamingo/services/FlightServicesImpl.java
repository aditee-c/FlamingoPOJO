package com.flamingo.services;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * @author Aditee Chourasiya
 * @creation_date  4 Oct 2019 11.50AM
 * @modification_date 4 Oct 2019 11.50AM
 * @version 1.0
 * @copyright Zensar Technologies. All rights resesrved
 * @description It is a Service class Implementation of Flight used in Bussiness layer
 */
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flamingo.dao.FlightDao;
import com.flamingo.entities.Flight;

@Service
@Transactional
public class FlightServicesImpl implements FlightServices {
	@Autowired
	private FlightDao flightDao;

	@Override
	public List<Flight> findAllFlights() {

		return flightDao.getAll();
	}

	@Override
	public Flight findFlightById(int flightid) {

		return flightDao.getById(flightid);
	}

	@Override
	public void addFlight(Flight flight) {
		flightDao.insert(flight);

	}

	@Override
	public void updateFlight(Flight flight) {
		flightDao.update(flight);

	}

	@Override
	public void removeFlight(Flight flight) {

		flightDao.delete(flight);
	}

	@Override
	public List<Flight> findFlightByLocation(String from, String to) {
		List<Flight> all = flightDao.getAll();
		List<Flight> filterByLocation = new ArrayList<>();
		for (Flight flight : all) {
			if (flight.getFromLocation() == from && flight.getToLocation() == to) {
				filterByLocation.add(flight);
			}
		}
		return filterByLocation;
	}

	@Override
	public List<Flight> findFlightByDate(LocalDate date) {
		List<Flight> all = flightDao.getAll();
		List<Flight> filterByDate = new ArrayList<>();
		for (Flight flight : all) {
			if (flight.getDepartureDate() == date) {
				filterByDate.add(flight);
			}
		}
		return filterByDate;
	}

	@Override
	public Long getCountOfSeats() {

		long count = 0;
		List<Flight> all = flightDao.getAll();
		for (Flight flight : all) {
			count++;
		}
		return count;
	}

	@Override
	public void updateAvailableSeats(Flight flight, int oldTotal, int newTotal) {
		int oldAvail = flight.getTotalSeats();
		System.out.println("Old Seats available are" + flight.getTotalSeats());
		flight.setTotalSeats(newTotal - (oldTotal - oldAvail));
		System.out.println("Available seats are " + flight.getTotalSeats());

	}

}
