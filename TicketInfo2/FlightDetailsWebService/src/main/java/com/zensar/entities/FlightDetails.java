package com.zensar.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="flightdetails")
public class FlightDetails {
	@Id
	@Column(name="Id")
    private String flightId;
    private double price;
    private int availableseats;
    private LocalDateTime Departuredate_time;
    

public  FlightDetails() {
	
}


public FlightDetails(String flightId, double price, int availableseats, LocalDateTime departuredate_time) {
	super();
	this.flightId = flightId;
	this.price = price;
	this.availableseats = availableseats;
	Departuredate_time = departuredate_time;
}


public String getFlightId() {
	return flightId;
}


public void setFlightId(String flightId) {
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