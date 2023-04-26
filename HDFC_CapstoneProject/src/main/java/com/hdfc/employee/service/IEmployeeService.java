package com.hdfc.employee.service;

import com.hdfc.employee.dto.EmployeeDTO;
import com.hdfc.employee.entity.Employee;
import com.hdfc.employee.exception.InvalidEmployeeIdException;
import com.hdfc.employee.vo.EmployeeVO;

public interface IEmployeeService {

	public EmployeeVO getEmployeeById(int id) throws InvalidEmployeeIdException;
	public Employee addEmployee(EmployeeDTO dto);
}
