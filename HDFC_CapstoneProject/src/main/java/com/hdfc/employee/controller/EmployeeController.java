package com.hdfc.employee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.employee.dto.EmployeeDTO;
import com.hdfc.employee.entity.Employee;
import com.hdfc.employee.exception.InvalidEmployeeIdException;
import com.hdfc.employee.service.IEmployeeService;
import com.hdfc.employee.vo.EmployeeVO;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	IEmployeeService empService;

	@GetMapping("/get/{id}")
	public EmployeeVO findByID(@PathVariable int id) throws InvalidEmployeeIdException {
		
		
		return empService.getEmployeeById(id);
	}
	
	
	
	
	  @RequestMapping(value="/options", method = RequestMethod.OPTIONS)
	  ResponseEntity<?> collectionOptions() { return ResponseEntity
	  .ok().allow(HttpMethod.GET, HttpMethod.POST, HttpMethod.OPTIONS) .build(); }
	  
	  
	  
	  @PostMapping("/add") public Employee addEmployee(@RequestBody EmployeeDTO
	  dto) { return empService.addEmployee(dto); }
	  
	 
}
