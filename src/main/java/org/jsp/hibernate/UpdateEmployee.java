package org.jsp.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee id to update details ");
		int eid= sc.nextInt();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
   Employee e=s.get(Employee.class, eid); //persistent state
   
   if(e!=null) {
	   System.out.println("Enter the Name , phone ,designation , salary, and password to update ");
	   e.setName(sc.next());
	   e.setPhone(sc.nextLong());
	   e.setDesg(sc.next());
	   e.setSalary(sc.nextDouble());
	   e.setPassword(sc.next());
	   Transaction t = s.beginTransaction();
	   t.commit();
   }
   else {
	   System.out.println("can not update as the entered id is invalid");
              }
   
	     }

     }
