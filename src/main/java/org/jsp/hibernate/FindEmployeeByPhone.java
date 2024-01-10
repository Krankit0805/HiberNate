package org.jsp.hibernate;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindEmployeeByPhone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee phone number to display details :");
		long phone = sc.nextLong();
		Session s= new Configuration().configure().buildSessionFactory().openSession();
		Query<Employee> q= s.createQuery("select e from Employee e where e.phone=:ph" );
		q.setParameter("ph", phone);
		try {
			Employee e = q.getSingleResult();
			 System.out.println("Employee id : " + e.getId());
			  System.out.println("Employee Name : " + e.getName());
			  System.out.println("Employee number : " + e.getPhone());
			  System.out.println("Employee designation : " + e.getDesg());
			  System.out.println("Employee salary : " + e.getSalary());
			  System.out.println("-------------------------------------------");
		}catch(NoResultException e) {
			System.err.println("No Employee with the phone number : "+phone);
		}
	}

}
