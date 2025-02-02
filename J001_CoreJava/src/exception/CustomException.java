package exception;

class InvalidAmountException extends Exception{
	private String message;
	
	public InvalidAmountException(String message) {
		super(message);
		this.message=message;
		
	}
}

class Account{
	double balance=0;
	
	void deposit(double amount)throws InvalidAmountException{
		if(amount>0) {
			balance+=amount;
		}
		else {
			//throw exception explicitly
			throw new InvalidAmountException("Invalid Amount");
		}
	}
	void withdraw(double amount) {
		if(amount >0 && amount <=balance) {
			balance-=amount;
			
		}
		else {
			try {
				//throw exception explicitly
				throw new InvalidAmountException("Invalid Amount");
			}
			catch(InvalidAmountException e) {
				e.printStackTrace();
			}
		}
	}
	void showBalance() {
		System.out.println("Account Balance:"+balance);
	}
}
public class CustomException {
    
	public static void main(String[] args) {
		 Account acc1=new Account();
		 try {
			acc1.deposit(-400);
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 acc1.withdraw(200);
		 acc1.showBalance();
	}
}
