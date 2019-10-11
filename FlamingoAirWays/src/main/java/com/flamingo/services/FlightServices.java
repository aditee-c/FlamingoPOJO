package com.flamingo.services;
/**
 * @author Aditee Chourasiya
 * @creation_date  4 Oct 2019 11.35AM
 * @modification_date 4 Oct 2019 11.35AM
 * @version 1.0
 * @copyright Zensar Technologies. All rights resesrved
 * @description It is a Service Interface of product used in Bussiness layer
 */
import java.time.LocalDate;
import java.util.List;

import com.flamingo.entities.Flight;
public interface FlightServices {
	List<Flight> findAllFlights();
	Flight findFlightById(int flightid);
	void addFlight(Flight flight);
	void updateFlight(Flight flight) ;
	void removeFlight(Flight flight);
	List<Flight> findFlightByLocation(String from,String to);
	List<Flight> findFlightByDate(LocalDate date);
	public Long getCountOfSeats();
	
}
