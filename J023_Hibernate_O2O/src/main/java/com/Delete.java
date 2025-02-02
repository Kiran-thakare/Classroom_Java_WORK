package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Delete {
	public static void main(String[] args) {
		System.out.println("Hello World!");


		Answer a = new Answer();
		a.setAns("Java is Object oriented and platform indepandent programing language");
		
		
		Question q = new Question();
		q.setQuestion("What is Java ?");
		q.setAns(a);


		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Question.class)
				.addAnnotatedClass(Answer.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		/* s.delete(s.load(Question.class, 2)); */
		s.delete(s.load(Answer.class, 1));
		tx.commit();

		s.close();
		sf.close();
		System.out.println("Complete!");
	}
}
