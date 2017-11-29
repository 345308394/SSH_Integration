package com.xin.entity;

public class Employee {
	private int empId;
	private String empName;
	private String password;
	private String gender;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(int empId, String empName, String password, String gender) {
		this.empId = empId;
		this.empName = empName;
		this.password = password;
		this.gender = gender;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
}
