package org.jsp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("ABC");
		e.setDesg("Developer");
		e.setPhone(8876543210L);
		e.setSalary(50000);
		e.setPassword("abc123");
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		int id = (Integer) s.save(e);
		Transaction t = s.beginTransaction();
		t.commit();
		System.out.println("user saved with Id :" + id);

	}

}
