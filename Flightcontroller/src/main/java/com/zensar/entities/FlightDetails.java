package com.zensar.entities;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

/**
 * @author TRG
 *
 */
@Component
public class FlightDetails {
	
    private int flightId;
    private double price;
    private int availableseats;
    private LocalDateTime Departuredate_time;
	
   
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}
	public LocalDateTime getDeparturedate_time() {
		return Departuredate_time;
	}
	public void setDeparturedate_time(LocalDateTime departuredate_time) {
		Departuredate_time = departuredate_time;
	}
	@Override
	public String toString() {
		return "FlightDetails [flightId=" + flightId + ", price=" + price + ", availableseats=" + availableseats
				+ ", Departuredate_time=" + Departuredate_time + "]";
	}
    
    
}
