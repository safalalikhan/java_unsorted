package com.masai;

@SuppressWarnings("serial")
public class InvalidAgeException extends RuntimeException{
	public InvalidAgeException() {
		
	}
	public InvalidAgeException(String message) {
		super(message);
	}
	

}
