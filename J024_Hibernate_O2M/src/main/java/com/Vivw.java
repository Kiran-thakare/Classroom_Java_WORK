package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Vivw {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Product.class)
				.addAnnotatedClass(Catagery.class).buildSessionFactory();

		Session s = sf.openSession();
		/*
		 * List<Catagery> q1 = s.createQuery("from Catagery").list(); for (Catagery q :
		 * q1) { System.out.println(q.getCname()); }
		 */

		List<Product> q1 = s.createQuery("from Product").list();
		for (Product q : q1) {
			System.out.println(q.getName());
			System.out.println(q.getC().getCname());
		}

		s.close();
		sf.close();
		System.out.println("Complete!");
	}
}
