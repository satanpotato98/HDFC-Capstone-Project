package com.hdfc.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;


@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(InvalidEmployeeIdException.class)
	public ResponseEntity<String> invalidId() {
		return  new ResponseEntity<String>("Invalid EmployeeID",HttpStatus.EXPECTATION_FAILED);
	}
	

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<String> typeMismatch() {
		return  new ResponseEntity<String>("Invalid EmployeeID: enter an positive integer",HttpStatus.EXPECTATION_FAILED);
	}
	
}
