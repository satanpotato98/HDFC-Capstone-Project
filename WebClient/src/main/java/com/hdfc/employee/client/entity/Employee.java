package com.hdfc.employee.client.entity;

import java.time.LocalDate;

public class Employee {

	
	private int employeeID;
	private String employeeName;
	private String dateOfBirth;
	
	
	  
	
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


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Employee(int employeeID, String employeeName, String dateOfBirth) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
