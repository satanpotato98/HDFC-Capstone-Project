package com.HDFC.employee.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.HDFC.employee.client.decrypter.Aes256;
import com.HDFC.employee.client.entity.Employee;


@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	RestTemplate rest;
	@GetMapping("/employee/{id}")
	public Employee getemployeedetails(@PathVariable int id) {
		Employee result=rest.getForObject("https://localhost:9090/employee/get/"+id, Employee.class);
		result.setDateOfBirth(Aes256.decrypt(result.getDateOfBirth()));
		return result;
	}

}

