package com.flamingo.exception;

public class PaymentException extends Exception
{
	private String errormessage;
	
	public PaymentException() 
	{
		System.out.println("Payment Failed");
	}

	public PaymentException(String errormessage) 
	{
		super(errormessage);
		this.errormessage = errormessage;
	}
	
}