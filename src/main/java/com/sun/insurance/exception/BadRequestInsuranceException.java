package com.sun.insurance.exception;

public class BadRequestInsuranceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String errorMessage;
	Throwable cause;
	
	public BadRequestInsuranceException(String message, Throwable cause) {
		super(message, cause);
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public Throwable getCause() {
		return cause;
	}
	
	
	
}
