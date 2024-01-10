package org.jsp.hibernate;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindEmployeeByName {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Employee Name to Display Details ");
    String  name =sc.next();
    Session s= new Configuration().configure().buildSessionFactory().openSession();
    Query<Employee> q=s.createQuery("select  e from Employee e where e.name=?1");
    q.setParameter(1,name);
    List<Employee> emps = q.getResultList();
    if(emps.size()>0) {
    	for(Employee e:emps) {
    		 System.out.println("Employee id : " + e.getId());
			  System.out.println("Employee Name : " + e.getName());
			  System.out.println("Employee number : " + e.getPhone());
			  System.out.println("Employee designation : " + e.getDesg());
			  System.out.println("Employee salary : " + e.getSalary());
			  System.out.println("-------------------------------------------");
    	}
    }
    	else {
    		System.err.println("No Employee With The Name :"+name);
    	}
    }
	}


