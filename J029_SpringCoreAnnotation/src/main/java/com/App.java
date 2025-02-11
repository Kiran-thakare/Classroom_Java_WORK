package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		AnnotationConfigApplicationContext cx = new AnnotationConfigApplicationContext(AppConfig.class);
		Account a1 = cx.getBean("savingAccount", Account.class);
		a1.deposit();

		Account a2 = cx.getBean("loanAccount", Account.class);
		a2.deposit();
	}
}
