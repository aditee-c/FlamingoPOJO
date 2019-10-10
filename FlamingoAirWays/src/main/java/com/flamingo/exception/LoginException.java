package com.flamingo.exception;

public class LoginException extends Exception
{
	private String errormessage;
	
	public LoginException() 
	{
		System.out.println("Login Failed");
	}

	public LoginException(String errormessage) 
	{
		super(errormessage);
		this.errormessage = errormessage;
	}
	
}