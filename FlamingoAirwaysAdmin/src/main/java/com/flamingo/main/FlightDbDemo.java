package com.flamingo.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.flamingo.entities.Flight;
import com.flamingo.entities.FlightDetails;


public class FlightDbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c1 = new Configuration().configure();
		SessionFactory sf1 = c1.buildSessionFactory();
		Session s1 = sf1.openSession();
		Transaction t1 = s1.beginTransaction();

		Flight f = new Flight();
		f.setFlightName("goAir");
		f.setFromLocation("mumbai");
		f.setToLocation("delhi");
		f.setDepartureDate(LocalDate.of(2019, 9, 29));
		f.setArrivalDate(LocalDate.of(2019, 9, 29));
		f.setDepartureTime(LocalTime.of(21, 30));
		f.setArrivalTime(LocalTime.of(23, 30));
		f.setDuration(2f);
		f.setTotalSeats(30);

		s1.save(f);
		FlightDetails flight = new FlightDetails();
		flight.setAvailableSeats(30);
		flight.setDepartureDateTime(LocalDateTime.of(LocalDate.of(2019, 9, 29), LocalTime.of(2, 00)));
		flight.setPrice(3000);
		flight.setId(1);
		flight.setFlight(f);

		FlightDetails flight1 = new FlightDetails();
		flight1.setAvailableSeats(20);
		flight1.setDepartureDateTime(LocalDateTime.of(LocalDate.of(2019, 9, 29), LocalTime.of(3, 00)));
		flight1.setPrice(4000);
		flight1.setId(2);
		flight1.setFlight(f);
		List<FlightDetails> fly = new ArrayList<FlightDetails>();
		fly.add(flight);
		fly.add(flight1);

		s1.save(f);
		s1.save(flight);
		s1.save(flight1);

		t1.commit();
		s1.close();

	}

}