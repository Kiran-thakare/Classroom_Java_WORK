/* Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and 
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' 
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
method by creating an object of each of the three classes.

 */

abstract class Bank {

	abstract void getBalance();
}

class BankA extends Bank {

	@Override
	void getBalance() {
		int balance = 100;
		System.out.println("Bank A Balance :" + balance);

	}

}

class BankB extends Bank {

	@Override
	void getBalance() {
		int balance = 150;
		System.out.println("Bank B Balance :" + balance);

	}

}

class BankC extends Bank {

	@Override
	void getBalance() {
		int balance = 200;
		System.out.println("Bank C Balance :" + balance);
	}

}

public class Q30 {

	public static void main(String[] args) {

		BankA b1 = new BankA();
		b1.getBalance();

		BankB b2 = new BankB();
		b2.getBalance();

		BankC b3 = new BankC();
		b3.getBalance();

	}
}
