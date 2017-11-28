package com.xin.service;

import com.xin.dao.EmployeeDao;

public class EmployeeService 
{
	//使用spring自动注入EmployeeDao实例
	EmployeeDao employeeDao;
	public void setEmployeeDao(EmployeeDao employeeDao)
	{
		this.employeeDao= employeeDao;
	}
	public void saveEmployee()
	{
		System.out.println("service执行了");
		employeeDao.saveEmployee();
	}
}
