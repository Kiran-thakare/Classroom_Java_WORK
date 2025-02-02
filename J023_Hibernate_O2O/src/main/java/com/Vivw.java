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

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Question.class)
				.addAnnotatedClass(Answer.class).buildSessionFactory();

		Session s = sf.openSession();
		List<Question> q1 = s.createQuery("from Question").list();
		for (Question q : q1) {
			System.out.println(q.getQuestion() + " :->" + q.getAns().getAns());
		}

		s.close();
		sf.close();
		System.out.println("Complete!");
	}
}
