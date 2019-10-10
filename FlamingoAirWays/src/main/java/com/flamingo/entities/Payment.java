package com.flamingo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CreditCard {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name = "profileid")
	private Passenger profile;
	@Column(nullable = false)
	private int card;
	@Column(nullable = false)
	private String cardType;
	@Column(nullable = false)
	private String ex_month;
	@Column(nullable = false)
	private String ex_year;
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
		return card;
	}
	public void setCard(int card) {
		this.card = card;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getEx_month() {
		return ex_month;
	}
	public void setEx_month(String ex_month) {
		this.ex_month = ex_month;
	}
	public String getEx_year() {
		return ex_year;
	}
	public void setEx_year(String ex_year) {
		this.ex_year = ex_year;
	}
	
	
}
