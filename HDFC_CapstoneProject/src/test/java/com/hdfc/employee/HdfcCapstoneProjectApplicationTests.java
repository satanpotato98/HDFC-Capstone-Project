package com.hdfc.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.employee.entity.Employee;
import com.hdfc.employee.exception.InvalidEmployeeIdException;
import com.hdfc.employee.service.IEmployeeService;

@SpringBootTest
class HdfcCapstoneProjectApplicationTests {
	
	/*
	 * @Autowired IEmployeeService empService;
	 * 
	 * @Test public void findById() throws InvalidEmployeeIdException { Employee
	 * emp=new Employee(1,"shashwat",LocalDate.parse("1998-10-17"));
	 * assertEquals(emp.getEmployeeID(),
	 * empService.getEmployeeById(1).getEmployeeID());
	 * 
	 * }
	 */
	
}
