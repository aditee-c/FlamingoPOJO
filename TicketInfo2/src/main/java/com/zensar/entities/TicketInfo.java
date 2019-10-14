package com.zensar.entities;
import java.time.LocalDate;


/**
 * @author Risha Ansari
 * @creation_date 4 oct 2019 8.00pm
 * @modification_date  4 oct 2019 8.00pm
 * @version 2.0
 * @copyright Zensar technologies. All rights reserved
 * @description It is persistent class
 * 				It represents database table PRODUCT
 * 				It is POJO class
 *
 */

public class TicketInfo
{
	
	private int ticketId;
       private int seatNo;
      private int profieId;
	private String flightId;
	private LocalDate date;
	private String status;

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
	public int getProfieId() {
		return profieId;
	}
	public void setProfieId(int profieId) {
		this.profieId = profieId;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TicketInfo [ticketId=" + ticketId + ", seatNo=" + seatNo + ", profieId=" + profieId + ", flightId="
				+ flightId + ", date=" + date + ", status=" + status + "]";
	}

	public TicketInfo() {
		// TODO Auto-generated constructor stub
	}
	public TicketInfo(int ticketId, int seatNo, int profieId, String flightId, LocalDate date, String status) {
		super();
		this.ticketId = ticketId;
		this.seatNo = seatNo;
		this.profieId = profieId;
		this.flightId = flightId;
		this.date = date;
		this.status = status;
	}
}
	


