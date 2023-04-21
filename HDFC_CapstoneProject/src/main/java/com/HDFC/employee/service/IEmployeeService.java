package com.HDFC.employee.service;

import com.HDFC.employee.entity.Employee;
import com.HDFC.employee.exception.InvalidEmployeeIdException;

public interface IEmployeeService {

	public Employee getEmployeeById(int id) throws InvalidEmployeeIdException;
}
