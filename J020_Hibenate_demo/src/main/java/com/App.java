package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		Tops t=new Tops();
		t.setId(1);
		t.setName("Kiran");
		t.setEmail("Kiran123@gmail.com");
		t.setPhone("87623456789");

		SessionFactory fact = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tops.class)
				.buildSessionFactory();
		
		Session s=fact.openSession();
		Transaction tx=s.beginTransaction();
		
		s.saveOrUpdate(t);
		
		tx.commit();
	
	}
}
