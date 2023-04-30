package com.hdfc.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.employee.dto.EmployeeDTO;
import com.hdfc.employee.encrypter.Aes256;
import com.hdfc.employee.entity.Employee;
import com.hdfc.employee.exception.InvalidEmployeeIdException;
import com.hdfc.employee.repository.EmployeeRepo;
import com.hdfc.employee.vo.EmployeeVO;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public EmployeeVO getEmployeeById(int id) throws InvalidEmployeeIdException {

		Employee emp=employeeRepo.findById(id).orElse(null);
		if(emp==null) {
			throw new InvalidEmployeeIdException();
		}
		else {
			EmployeeVO vo=new EmployeeVO();
			String x=Aes256.encrypt(emp.getDateOfBirth().toString());
			vo.setDateOfBirth(x);
			vo.setEmployeeID(id);
			vo.setEmployeeName(emp.getEmployeeName());
			return vo;
		}
	}

	@Override
	public Employee addEmployee(EmployeeDTO dto) {
		
		Employee emp=new Employee();
		emp.setDateOfBirth(dto.getDateOfBirth());
		emp.setEmployeeName(dto.getEmployeeName());

		return employeeRepo.save(emp);
	}

}
