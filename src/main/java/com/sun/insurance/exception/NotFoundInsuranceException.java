package com.sun.insurance.exception;

import org.springframework.http.HttpStatus;

public class NotFoundInsuranceException extends RuntimeException  {

	private static final long serialVersionUID = 1L;
	HttpStatus errorCode;
	String errorMessage;
	
	public NotFoundInsuranceException(HttpStatus errorCode, String errorMessage) {
		super(errorMessage);
		this.errorCode = errorCode;
	}
	
		
	
}
