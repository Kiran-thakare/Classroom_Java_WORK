package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Instructor;
import model.Student;
import model.Subject;
import model.YoutubeChannel;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(YoutubeChannel.class).addAnnotatedClass(Student.class)
				.addAnnotatedClass(Subject.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Instructor i = new Instructor();
		i.setInsName("Ram");

		YoutubeChannel y1 = new YoutubeChannel();
		y1.setYbName("Code with Java");
		y1.setIns(i);

		Subject sub = new Subject();
		sub.setName("Java");
		sub.setIns(i);

		Student st = new Student();
		st.setName("Saurabh");
		st.addSubject(sub);

		Instructor i1 = new Instructor();
		i1.setInsName("Lalit");

		YoutubeChannel yt = new YoutubeChannel();
		yt.setYbName("Code with Python");
		yt.setIns(i1);

		Subject sub1 = new Subject();
		sub1.setName("Java");
		sub1.setIns(i1);

		Student st1 = new Student();
		st1.setName("Hariom");
		st1.addSubject(sub1);

		s.save(i);
		s.save(y1);
		s.save(sub);
		s.save(st);
		s.save(i1);
		s.save(yt);
		s.save(sub1);
		s.save(st1);

		tx.commit();

		System.out.println("Done......");
	}
}
