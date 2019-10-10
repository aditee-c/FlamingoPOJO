package com.flamingo.exception;

public class PassengerException extends Exception
{
	private String errormessage;
	
	public PassengerException() 
	{
		System.out.println("Passenger Operation Failed. Please try again");
	}

	public PassengerException(String errormessage) 
	{
		super(errormessage);
		this.errormessage = errormessage;
	}
	
	
}
