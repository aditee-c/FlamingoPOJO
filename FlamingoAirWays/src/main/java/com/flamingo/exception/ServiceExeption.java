package com.flamingo.exception;

public class ServiceExeption extends Exception {
	public ServiceExeption() {
		super("Not Found");
	}
	public ServiceExeption(String message) {
		super(message);
	}
}
