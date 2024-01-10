package org.jsp.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee2 {

	public static void main(String[] args) {
		Employee e= new Employee(); //transient state
		e.setId(1);
		e.setName("pushpa");
		e.setPhone(987654);
		e.setDesg("smugller");
		e.setSalary(55000);
		e.setPassword("shrivali");
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		s.saveOrUpdate(e);//s.update(e)
		Transaction t = s.beginTransaction();
		t.commit();

	}

}
