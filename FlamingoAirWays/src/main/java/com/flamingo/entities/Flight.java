package com.flamingo.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author akansh_sai
 * @version 1.0
 * @creation date 28th sept 2019 16:50pm
 * @description this is flight db
 *
 */
@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
	private int flightId;
	private String flightName;
	private String fromLocation;
	private String toLocation;
	private LocalDate departureDate;
	private LocalDate arrivalDate;
	private LocalTime departureTime;
	private LocalTime arrivalTime;
	private float duration;
	private int totalSeats;
	@OneToMany(mappedBy = "flight")
	private List<FlightDetails> fly;
	@OneToMany(mappedBy="flight")
	private List<TicketInfo> tkt;
	
	public List<TicketInfo> getTkt() {
		return tkt;
	}

	public void setTkt(List<TicketInfo> tkt) {
		this.tkt = tkt;
	}

	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public Flight(int flightId, String flightName, String fromLocation, String toLocation, LocalDate departureDate,
			LocalDate arrivalDate, LocalTime departureTime, LocalTime arrivalTime, float duration, int totalSeats) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.totalSeats = totalSeats;
	}

	public List<FlightDetails> getFly() {
		return fly;
	}

	public void setFly(List<FlightDetails> fly) {
		this.fly = fly;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

}