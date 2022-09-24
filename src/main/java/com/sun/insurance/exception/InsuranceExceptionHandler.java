package com.sun.insurance.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class InsuranceExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = {NotFoundInsuranceException.class})
	public ResponseEntity<InsuranceException> handleDataNotFound(NotFoundInsuranceException ex, WebRequest request) {
		InsuranceException insuranceException = new InsuranceException(ex.getMessage(), ex.getCause(), HttpStatus.NOT_FOUND);
		return new ResponseEntity<InsuranceException>(insuranceException ,HttpStatus.NOT_FOUND);
	}

}
