package com.sun.insurance.exception;

import org.springframework.http.HttpStatus;

public class NotFoundInsuranceException extends RuntimeException  {

	private static final long serialVersionUID = 1L;
	HttpStatus status;
	String message;
	
	
	public NotFoundInsuranceException(HttpStatus status, String message) {
		this.status = status;
		this.message = message;
	}
	
	
}
