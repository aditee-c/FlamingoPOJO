package com.flamingo.exception;

public class ServiceException extends Exception
{
	private String errormessage;
	
	public ServiceException() 
	{
		System.out.println("Service Interrupted. Please Try Again!!");
	}

	public ServiceException(String errormessage) 
	{
		super(errormessage);
		this.errormessage = errormessage;
	}
	
}
