package com.flamingo.exception;

public class AdminException extends Exception
{
		private String errormessage;
		
		public AdminException() 
		{
			System.out.println("Admin permissions denied.Please try again");
		}

		public AdminException(String errormessage) 
		{
			super(errormessage);
			this.errormessage = errormessage;
		}
}
