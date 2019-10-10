package com.flamingo.exception;

public class FlightException extends Exception {
private String errormessage;
	
	public FlightException() 
	{
		System.out.println("Flight Not Found . Operation Failed. Please try again");
	}

	public FlightException(String errormessage) 
	{
		super(errormessage);
		this.errormessage = errormessage;
	}

}