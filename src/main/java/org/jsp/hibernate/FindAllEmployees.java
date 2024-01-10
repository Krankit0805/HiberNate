package org.jsp.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindAllEmployees {

	public static void main(String[] args) {
		String hql ="select emp from Employee emp";
		Session s =new Configuration().configure().buildSessionFactory().openSession();
		Query<Employee> q = s.createQuery(hql);
		List<Employee> emps = q.getResultList();
		for (Employee e :emps) {
			
			 System.out.println("Employee id : " + e.getId());
			  System.out.println("Employee Name : " + e.getName());
			  System.out.println("Employee number : " + e.getPhone());
			  System.out.println("Employee designation : " + e.getDesg());
			  System.out.println("Employee salary : " + e.getSalary());
			  System.out.println("-------------------------------------------");
		}
	}

}
