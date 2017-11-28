package com.xin.action;

import com.xin.service.EmployeeService;

public class EmployeeAction {
	
	//使用spring自动注入EmployeeService实例
	EmployeeService employeeService;
	public void setEmployeeService(EmployeeService employeeService)
	{
		this.employeeService=employeeService;
	}
	
	public String save()
	{	
		System.out.println("action执行了");
		employeeService.saveEmployee();
		return "success";
	}
	
}
