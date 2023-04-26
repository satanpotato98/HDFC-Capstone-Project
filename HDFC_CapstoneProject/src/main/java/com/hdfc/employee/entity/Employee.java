package com.hdfc.employee.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeID;
	@NotNull
	private String employeeName;
	@NotNull @Past
	private LocalDate dateOfBirth;
	
	public Employee() {
		super();	
	}
	
	

	public Employee(int employeeID, String employeeName, LocalDate dateOfBirth) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}



	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
