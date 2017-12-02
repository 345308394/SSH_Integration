package com.xin.dao;

import java.util.ArrayList;
import java.util.List;

//import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.criterion.Restrictions;

import com.xin.entity.Employee;


public class EmployeeDao{
	List<Employee> employeeList = new ArrayList<Employee>();
	Employee employee;
	String hql="";
	Transaction tx = null;
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	public void saveEmployee(Employee employee)
	{	
		tx=getSession().beginTransaction();
		getSession().save(employee);
		tx.commit();
	}
	public List<Employee> AllEmployee(){
		tx=getSession().beginTransaction();
		hql ="from Employee";
		Query query= getSession().createQuery(hql);
		List<Employee> list =query.list();
		tx.commit();
		return list;		
	}
	public void DeleteEmployee(Employee employee){
		tx=getSession().beginTransaction();
		getSession().delete(employee);
		tx.commit();
	}
	public void UpdateEmployee(Employee employee){
		tx = getSession().beginTransaction();
		getSession().update(employee);
		tx.commit();
		
	}
	public Employee FindEmpById(int id){
		tx=getSession().beginTransaction();
//		Criteria criteria = getSession().createCriteria(Employee.class);
//		Employee employee=(Employee)criteria.add(Restrictions.eq("id",id));	
		hql="from Employee as Emp where Emp.empId = :EmpId";
		Query query=getSession().createQuery(hql);
		query.setInteger("EmpId",id);
		Employee employee =  (Employee)query.uniqueResult();
		getSession().clear();
		return employee;	
	}
		
}
