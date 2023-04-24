package com.HDFC.employee.service;

import com.HDFC.employee.VO.EmployeeVO;
import com.HDFC.employee.dto.EmployeeDTO;
import com.HDFC.employee.entity.Employee;
import com.HDFC.employee.exception.InvalidEmployeeIdException;

public interface IEmployeeService {

	public EmployeeVO getEmployeeById(int id) throws InvalidEmployeeIdException;
	public Employee addEmployee(EmployeeDTO dto);
}
