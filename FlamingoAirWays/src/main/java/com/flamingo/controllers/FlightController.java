package com.flamingo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.flamingo.dao.FlightDao;
import com.flamingo.entities.Flight;
import com.flamingo.exception.FlightException;
import com.flamingo.services.FlightServices;


public class FlightController {
	@Autowired
	@Qualifier("flightdao")
	FlightDao flightdao;
	@Autowired
	private FlightServices flightService;
	@RequestMapping(value="/ListFlights.htm", method=RequestMethod.GET)
	public String listForm(HttpServletRequest request) throws FlightException
	{
		HttpSession session = request.getSession();
		List<Flight> listOfFlights = null;
		
		listOfFlights = flightdao.getAll();
		
		session.setAttribute("listOfFlights",listOfFlights);
		return "ListFlights";
	}
	}
