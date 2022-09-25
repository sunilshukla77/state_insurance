package com.sun.insurance.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class InsuranceExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = {NotFoundInsuranceException.class})
	public ResponseEntity<Object> handleDataNotFound(NotFoundInsuranceException ex, WebRequest request) {
		InsuranceException insuranceException = new InsuranceException(ex.getMessage(),HttpStatus.NOT_FOUND, ZonedDateTime.now());
		return new ResponseEntity<Object>(insuranceException ,HttpStatus.NOT_FOUND);
	}

}
