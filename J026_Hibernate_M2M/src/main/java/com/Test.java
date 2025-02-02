package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.Subject;

public class Test {

	public static void main(String[] args) {

		Subject s1 = new Subject();
		s1.setSubname("Java");

		Subject s2 = new Subject();
		s2.setSubname("Python");

		Subject s3 = new Subject();
		s3.setSubname("Asp.net");

		Student s = new Student();
		s.setSname("Ram");

		Student st = new Student();
		st.setSname("Hariom");

		s1.addStudent(s);
		s2.addStudent(s);
		s1.addStudent(st);
		s2.addStudent(st);
		s3.addStudent(st);

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Subject.class).buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(s);
		session.save(st);
		session.save(s1);
		session.save(s2);
		session.save(s3);

		tx.commit();

	}

}
