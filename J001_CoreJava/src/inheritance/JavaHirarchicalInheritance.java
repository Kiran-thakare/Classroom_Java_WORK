package inheritance;

class Account {
	String accountNumber;
	double balance = 0;

	void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + "Deposit Successfully");

		}
	}

	void withdrawal(double amount) {
		if (amount > 0) {
			if (balance <= amount) {
				balance -= amount;
				System.out.println(amount + " : Withdrwal Successfully...!!");

			} else {
				System.out.println("Invalid Amount....!!");
			}
		}
	}

	void showBalance() {
		System.out.println("Account Balance For The Account (" + accountNumber + ") :" + balance);
	}

}

class SavingAccount extends Account {

	final double intRate = 6;

	double getIntrestAmount() {
		return balance * 6 / 100;
	}
}

class CurrentAccount extends Account {

	final double odAmount = 5000;

	void withdrwalAgainestOverDraft(double amount) {
		if (amount > 0) {
			if (amount <= balance + odAmount) {
				balance -= amount;
				System.out.println(amount + " withdrawal Successfully Againest Overdraft.");
			} else {
				System.out.println("invalid Amount..!!!");
			}
		}
	}
}

public class JavaHirarchicalInheritance {

	public static void main(String[] args) {

		SavingAccount sv = new SavingAccount();
		sv.accountNumber = "xxxxx12";

		CurrentAccount ca = new CurrentAccount();
		ca.accountNumber = "xxxx13";

		sv.showBalance();
		ca.showBalance();
		
		sv.deposit(500);
		ca.deposit(1000);
		sv.deposit(4500);
		sv.withdrawal(400);
		
		sv.showBalance();
		ca.showBalance();
		
		System.out.println("intrest amount :"+sv.getIntrestAmount());
		ca.withdrwalAgainestOverDraft(3000);
		
		ca.showBalance();

	}
}
