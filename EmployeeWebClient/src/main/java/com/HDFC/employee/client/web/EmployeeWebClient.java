package com.HDFC.employee.client.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.HDFC.employee.client.decrypter.Aes256;
import com.HDFC.employee.client.entity.Employee;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webclient")
public class EmployeeWebClient {

	private static final String baseUrl = "http://localhost:9090/employee";
	@Autowired
	RestTemplate rt;
	
	

	
	
	  @GetMapping("/{id}")
	  public Employee getEmp(@PathVariable int id) { 
		  	  
		  Employee emp =rt.getForObject(baseUrl+"/get/"+id, Employee.class);
		  emp.setDateOfBirth(Aes256.decrypt(emp.getDateOfBirth()));
		  return emp;
	  }
	 
	

}
