package com.HDFC.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HDFC.employee.entity.Employee;
import com.HDFC.employee.exception.InvalidEmployeeIdException;
import com.HDFC.employee.repository.EmployeeRepo;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public Employee getEmployeeById(int id) throws InvalidEmployeeIdException {
		// TODO Auto-generated method stub
		Employee emp=employeeRepo.findById(id).orElse(null);
		if(emp==null) {
			throw new InvalidEmployeeIdException();
		}
		else return emp;
	}

}
