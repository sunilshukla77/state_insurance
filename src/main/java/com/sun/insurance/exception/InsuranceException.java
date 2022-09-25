package com.sun.insurance.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class InsuranceException {
	private String message;
	private HttpStatus httpStatus;
	private ZonedDateTime time;
	
	public InsuranceException(String message, HttpStatus httpStatus, ZonedDateTime time) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;
		this.time = time;
	}
	
	public String getMessage() {
		return message;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public ZonedDateTime getTime() {
		return time;
	}

}
