package com.HDFC.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(InvalidEmployeeIdException.class)
	public ResponseEntity<String> bookingNotFound() {
		return  new ResponseEntity<String>("Invalid EmployeeID",HttpStatus.EXPECTATION_FAILED);
	}

}
