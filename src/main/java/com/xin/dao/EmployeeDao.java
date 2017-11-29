package com.xin.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xin.entity.Employee;

public class EmployeeDao{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void saveEmployee(Employee employee)
	{
		System.out.println("dao层执行了");
		Session session = sessionFactory.openSession();
		session.save(employee);
		session.close();
	}
		
}
