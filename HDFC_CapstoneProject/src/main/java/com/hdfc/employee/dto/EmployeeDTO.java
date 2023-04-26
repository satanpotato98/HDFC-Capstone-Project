package com.hdfc.employee.dto;

import java.time.LocalDate;

public class EmployeeDTO {

	private String employeeName;
	private LocalDate dateOfBirth;
	
	
	
	public EmployeeDTO(String employeeName, LocalDate dateOfBirth) {
		super();

		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
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


	public EmployeeDTO() {
	}

}
