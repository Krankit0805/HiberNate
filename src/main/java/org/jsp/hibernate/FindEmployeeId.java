package org.jsp.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FindEmployeeId {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee id to display details");
		int eid = sc.nextInt();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Employee e = s.get(Employee.class, eid);
		if(e !=null) {
			System.out.println("Employee Id :" +e.getId());
			System.out.println("Employee name :" +e.getName());
			System.out.println("Employee phone number :" +e.getPhone());
			System.out.println("Designation :" +e.getDesg());
			System.out.println("Employee Id :" +e.getId());
			System.out.println("Employee salary:" +e.getSalary());
			
		}else {
			System.out.println("you have entered an invalid id");
		}
		
	}

}
