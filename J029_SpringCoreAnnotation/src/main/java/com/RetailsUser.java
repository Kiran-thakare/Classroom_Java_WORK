package com;

import org.springframework.stereotype.Component;

@Component
public class RetailsUser implements User {

	@Override
	public void userDetails() {
		System.out.println("Retails user...");

	}

}
