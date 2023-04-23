package com.HDFC.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HDFC.employee.dto.EmployeeDTO;
import com.HDFC.employee.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {



}
