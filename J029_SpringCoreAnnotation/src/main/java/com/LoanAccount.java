package com;

import org.springframework.stereotype.Component;

@Component
public class LoanAccount implements Account {

	@Override
	public void deposit() {
		System.out.println("Loan Amount Deposit......");

	}

}
