package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class View {

	public static void main(String[] args) {
		SessionFactory fact = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tops.class)
				.buildSessionFactory();

		Session s = fact.openSession();
		List<Tops> list = s.createQuery("from Tops").list();
		for (Tops t : list) {
			System.out.println("id :" + t.getId() + ",Name :" + t.getName());
		}

		Tops tops = s.get(Tops.class, 1);
		System.out.println(tops);
		System.out.println("id :" + tops.getId() + ",Name :" + tops.getName());
	}
}
