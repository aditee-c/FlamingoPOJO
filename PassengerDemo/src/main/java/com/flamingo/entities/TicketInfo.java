package com.flamingo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TicketInfo {
@Id
private int ticketId;
private int seatNo;
private String status;
@ManyToOne
@JoinColumn(name = "profileid")
private Passenger profile;
@ManyToOne
@JoinColumn(name = "flightId")
private Flight flight;
public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public int getSeatNo() {
	return seatNo;
}
public void setSeatNo(int seatNo) {
	this.seatNo = seatNo;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Passenger getProfile() {
	return profile;
}
public void setProfile(Passenger profile) {
	this.profile = profile;
}
public Flight getFlight() {
	return flight;
}
public void setFlight(Flight flight) {
	this.flight = flight;
}


}
