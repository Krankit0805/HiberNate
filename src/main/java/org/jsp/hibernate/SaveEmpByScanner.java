package org.jsp.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmpByScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name,phone,desg,salary,password to add new Employee");
		Employee e = new Employee();
		e.setName(sc.next());
		e.setPhone(sc.nextLong());
		e.setDesg(sc.next());
		e.setSalary(sc.nextDouble());
		e.setPassword(sc.next());;
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		int id = (Integer) s.save(e);
		Transaction t = s.beginTransaction();
		t.commit();
		System.out.println("user saved with Id :" + id);
	}
}
