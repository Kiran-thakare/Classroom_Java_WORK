package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Student st = cx.getBean("std", Student.class);
		Question q1 = (Question) cx.getBean("que");
		st.Display();
		q1.displayQAnswer();

	}
}
