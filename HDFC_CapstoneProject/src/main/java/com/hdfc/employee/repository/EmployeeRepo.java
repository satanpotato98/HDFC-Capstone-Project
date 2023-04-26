package com.hdfc.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.employee.dto.EmployeeDTO;
import com.hdfc.employee.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {



}