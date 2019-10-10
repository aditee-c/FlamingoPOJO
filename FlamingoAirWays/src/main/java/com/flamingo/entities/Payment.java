package com.flamingo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name = "profileid")
	private Passenger profile;
	@Column(nullable = false)
	private int cardNumber;
	@Column(nullable = false)
	private String cardType;
	@Column(nullable = false)
	private int ex_month; //int
	@Column(nullable = false)
	private int ex_year;//int
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Passenger getProfile() {
		return profile;
	}
	public void setProfile(Passenger profile) {
		this.profile = profile;
	}
	public int getCard() {
		return cardNumber;
	}
	public void setCard(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getEx_month() {
		return ex_month;
	}
	public void setEx_month(int ex_month) {
		this.ex_month = ex_month;
	}
	public int getEx_year() {
		return ex_year;
	}
	public void setEx_year(int ex_year) {
		this.ex_year = ex_year;
	}
	
	
	
}
