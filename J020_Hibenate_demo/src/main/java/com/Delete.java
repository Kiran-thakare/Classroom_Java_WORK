package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		SessionFactory fact = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tops.class)
				.buildSessionFactory();

		Session s = fact.openSession();
		Transaction tx = s.beginTransaction();

		Tops tops = s.get(Tops.class, 1);
		s.delete(tops);

		tx.commit();
		System.out.println("Delete Data...");
	}
}
