package com.xin.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xin.entity.Employee;
import com.xin.service.EmployeeService;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>,ServletRequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
	}
	public Employee getModel() {
		// TODO Auto-generated method stub
		return employee;
	}
	private Employee employee ;
	public void setEmployee(Employee employee){
		this.employee=employee;
	}
	public Employee getEmployee(){
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
		if("".equals(employee.getEmpName())){
			addActionError("用户名不能为空");
			return "failure";
		}
		else if ("".equals(employee.getPassword())){
			addActionError("密码不能为空");
			return "failure";
		}
		else if ("".equals(employee.getGender())){
			addActionError("性别不能为空");
			return "failure";
		}
		else{
		employeeService.saveEmployee(employee);
		return "AllEmp";
		}
		
	}
	public String AllEmployee(){
		HttpSession session=request.getSession();
		List<Employee> employeeList	=employeeService.AllEmployee();
//		System.out.println(employeeList);
		session.setAttribute("employeeList",employeeList);		
		System.out.println(employeeList);
		return "success";
	}
	
	public String DeleteEmployee(){
		employeeService.DeleteEmployee(employee);
		System.out.println(employee);
		return "AllEmp";
	}
	public String EmployeeDetails(){
		HttpSession session =request.getSession();
		Employee employeeDetail=employeeService.FindEmpById(employee.getEmpId());
		session.setAttribute("employee", employeeDetail);
		return "success";
	}
	public String UpdateEmployee(){
		employeeService.UpdateEmployee(employee);
		System.out.println(employee);
		return "AllEmp";
	}

	
	
	
}
