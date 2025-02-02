/*
 *  W.A.J.P to create a custom exception if Customer withdraw amount which is greater 
   than account balance then program will show custom exception otherwise amount 
	will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 
    2500 
    Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.
 */
class InvalidAmountException extends Exception {

	private String message;

	public InvalidAmountException(String message) {
		super(message);
		this.message = message;
	}

}

class Account {

	double balance = 0;

	void deposit(double amount) throws InvalidAmountException {
		if (amount > 0) {
			balance += amount;
		} else {
			// throw exception explicitly
			throw new InvalidAmountException("Invalid Amount");
		}
	}

	void withdraw(double amount) {

		if (amount > 0 && amount <= balance) {
			balance -= amount;
		} else {
			try {
				// throw exception explicitly
				throw new InvalidAmountException(
						"Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.");

			} catch (InvalidAmountException e) {
				e.printStackTrace();
			}
		}
	}

	void showBalance() {
		System.out.println("Account balance : " + balance);
	}

}

public class Q41 {

	public static void main(String[] args) {
		Account e1 = new Account();
		try {
			e1.deposit(2000);
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		e1.withdraw(2500);
		e1.showBalance();
	}
}
