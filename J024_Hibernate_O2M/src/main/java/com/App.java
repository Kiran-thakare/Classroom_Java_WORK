package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Catagery.class)
				.addAnnotatedClass(Product.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Catagery c = new Catagery();
		c.setCname("electronic");

		Product p = new Product();
		p.setName("Laptop");
		p.setC(c);

		Product p1 = new Product();
		p1.setName("Tv");
		p1.setC(c);
		
		Product p2 = new Product();
		p2.setName("Mobile");
		p2.setC(c);
		
		List<Product> li = new ArrayList<Product>();
		li.add(p);
		li.add(p1);
		li.add(p2);

		c.setP(li);

		s.save(c);

		tx.commit();

		s.close();
		sf.close();
		System.out.println("Complete!");
	}
}
