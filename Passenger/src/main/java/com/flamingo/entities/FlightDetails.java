package com.flamingo.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class FlightDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double price;
	private int availableSeats;
	private LocalDateTime DepartureDateTime;

	@ManyToOne
	@JoinColumn(name = "flightId")
	private Flight flight;
	@OneToMany(mappedBy = "ticket")
	private TicketInfo ticket;
	
	public TicketInfo getTicket() {
		return ticket;
	}

	public void setTicket(TicketInfo ticket) {
		this.ticket = ticket;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public LocalDateTime getDepartureDateTime() {
		return DepartureDateTime;
	}

	public void setDepartureDateTime(LocalDateTime departureDateTime) {
		DepartureDateTime = departureDateTime;
	}

	

}
