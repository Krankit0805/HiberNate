package org.jsp.hibernate;

import java.util.Scanner;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FindEmployee {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Employee Id to display details ");
  int eid = sc.nextInt();
  Session s = new Configuration().configure().buildSessionFactory().openSession();
  Employee e =s.load(Employee.class, eid);
  try {
	  System.out.println("Employee id : " + e.getId());
	  System.out.println("Employee Name : " + e.getName());
	  System.out.println("Employee number : " + e.getPhone());
	  System.out.println("Employee designation : " + e.getDesg());
	  System.out.println("Employee salary : " + e.getSalary());
  }catch (ObjectNotFoundException exception) {
	  System.err.println("Id is invalid");
  }
	}

}
