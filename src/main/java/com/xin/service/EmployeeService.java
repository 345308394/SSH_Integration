package com.xin.service;

import java.util.List;

import com.xin.dao.EmployeeDao;
import com.xin.entity.Employee;

public class EmployeeService 
{	
	Employee employee;
	//使用spring自动注入EmployeeDao实例
	EmployeeDao employeeDao;
	public void setEmployeeDao(EmployeeDao employeeDao)
	{
		this.employeeDao= employeeDao;
	}
	public void saveEmployee(Employee employee)
	{
		
		employeeDao.saveEmployee(employee);
	}
	public List<Employee> AllEmployee(){
		List<Employee> employeeList = employeeDao.AllEmployee();
		return employeeList;
	}
	public void DeleteEmployee(Employee employee){
		employeeDao.DeleteEmployee(employee);
	}
	public void UpdateEmployee(Employee employee){
		employeeDao.UpdateEmployee(employee);
	}
	public Employee FindEmpById(int id){
		return employeeDao.FindEmpById(id);	
	}
}
