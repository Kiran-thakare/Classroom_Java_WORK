package com;


import java.util.List;
import java.util.Set;

public class Student {

	private int id;
	private String name;
	private String email;
	private List<String> subjects;
	private Set<String> lang;
	private Address adr;
	private List<Account> accounts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Set<String> getLang() {
		return lang;
	}

	public void setLang(Set<String> lang) {
		this.lang = lang;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public void Display() {
		System.out.println(id + " " + name + " " + email);

		for (String s : subjects) {
			System.out.println(s);
		}
		System.out.println("**************************");
		for (String l : lang) {
			System.out.println(l);
		}
		System.out.println("**************************");
		adr.display();
		System.out.println("**************************");
		for (Account a : accounts) {
			a.display();
		}

	}

}
