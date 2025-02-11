package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SavingAccount implements Account {
	@Autowired
	@Qualifier("retailsUser")
	User user;

	@Autowired
	@Qualifier("corporateUser")
	User user2;

	@Override
	public void deposit() {
		System.out.println("Saving Account Calling.....!");
		user.userDetails();
		user2.userDetails();

	}

}
