package com.HDFC.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HDFC.employee.entity.Employee;
import com.HDFC.employee.exception.InvalidEmployeeIdException;
import com.HDFC.employee.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	IEmployeeService empService;

	@GetMapping("/get./{if}")
	public Employee findByID(@PathVariable int id) throws InvalidEmployeeIdException {
		return empService.getEmployeeById(id);
	}
}
