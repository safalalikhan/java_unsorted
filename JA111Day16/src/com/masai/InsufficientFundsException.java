package com.masai;

@SuppressWarnings("serial")
public class InsufficientFundsException extends RuntimeException{
	public InsufficientFundsException(String error) {
		super(error);
	}
	public InsufficientFundsException () {
		
	}

}
