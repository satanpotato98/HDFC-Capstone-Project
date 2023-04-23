package com.HDFC.employee.dto;

import java.time.LocalDate;

public class EmployeeDTO {

	
	private int employeeID;
	private int employeeName;
	private LocalDate dateOfBirth;
	
	
	
	public EmployeeDTO(int employeeID, int employeeName, LocalDate dateOfBirth) {
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


	public int getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(int employeeName) {
		this.employeeName = employeeName;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public EmployeeDTO() {
	}

}
