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

import com.flamingo.entities.CreditCard;
import com.flamingo.entities.Flight;
import com.flamingo.entities.FlightDetails;
import com.flamingo.entities.Passenger;
import com.flamingo.entities.TicketInfo;
import com.flamingo.entities.UserLogin;

public class FlightDbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c1 = new Configuration().configure();
		SessionFactory sf1 = c1.buildSessionFactory();
		Session s1 = sf1.openSession();
		Transaction t1 = s1.beginTransaction();

		Passenger p = new Passenger();
		p.setFname("Aditee");
		p.setLname("Chourasiya");
		p.setProfileId(1002);
		p.setAddress("Pune");
		p.setEmailId("aditee.chourasiya30@gmail.com");
		p.setPhoneNo(215313);

		CreditCard credit = new CreditCard();
		credit.setCard(1);
		credit.setCardType("Debit");
		credit.setEx_month("02");
		credit.setEx_year("2045");

		credit.setProfile(p);

		CreditCard credit1 = new CreditCard();
		credit1.setCard(2);
		credit1.setCardType("Credit");
		credit1.setEx_month("03");
		credit1.setEx_year("2023");
		credit1.setProfile(p);

		List<CreditCard> cardlist = new ArrayList<CreditCard>();
		cardlist.add(credit);
		cardlist.add(credit1);

		UserLogin user = new UserLogin();
		user.setUsername("aduu3");
		user.setPassword("Aditee");
		user.setId(2);
		user.setProfileId(p);

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
		flight.setPrice(3000);
		flight.setFlightDetailId(1);
		flight.setDepartureDateTime(LocalDateTime.of(2019, 10, 26, 23, 30));
		flight.setFlight(f);

		FlightDetails flight1 = new FlightDetails();
		flight1.setAvailableSeats(20);
		flight1.setDepartureDateTime(LocalDateTime.of(2019, 11, 27, 22, 00));
		flight1.setPrice(4000);
		flight1.setFlightDetailId(2);
		flight1.setFlight(f);
		List<FlightDetails> fly = new ArrayList<FlightDetails>();
		fly.add(flight);
		fly.add(flight1);

		TicketInfo tkt = new TicketInfo();
		tkt.setSeatNo(30);
		tkt.setStatus("CNF");
		tkt.setTicketId(12345);
		
		tkt.setFlightdetail(flight);
		tkt.setProfile(p);

		TicketInfo tkt1 = new TicketInfo();
		tkt1.setSeatNo(30);
		tkt1.setStatus("CNF");
		tkt1.setTicketId(12346);
		
		tkt1.setFlightdetail(flight1);
		tkt1.setProfile(p);
		List<TicketInfo> ticket = new ArrayList<>();
		ticket.add(tkt);
		ticket.add(tkt1);

		s1.save(p);
		s1.save(credit);
		s1.save(credit1);
		s1.save(user);
		s1.save(f);
		s1.save(flight);
		s1.save(flight1);
		s1.save(tkt);
		s1.save(tkt1);

		t1.commit();
		s1.close();

	}

}