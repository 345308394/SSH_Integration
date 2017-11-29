package com.xin.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xin.entity.Employee;
import com.xin.service.EmployeeService;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Employee employee = new Employee();
	public Employee getModel() {
		// TODO Auto-generated method stub
		return employee;
	}
	//使用spring自动注入EmployeeService实例
	EmployeeService employeeService;
	public void setEmployeeService(EmployeeService employeeService)
	{
		this.employeeService=employeeService;
	}
	
	public String save()
	{	
		System.out.println("action执行了");
		employeeService.saveEmployee(employee);
		return "success";
	}

	
	
}
