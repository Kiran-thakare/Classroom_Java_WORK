package exception;

class Test1 {

	double calculateInterest(double amount) throws InvalidAmountException {
		if(amount>0) {
			return amount * 10 / 100;
		}else {
			// throw exception
			throw new InvalidAmountException("Amount must be greater than 0");
		}
	}

}
public class ThrowsKeyword {
   public static void main(String[] args) {
	
	   System.out.println("program starts");

		String[] array = { "ritesh", "jigar", "pawan" };
		System.out.println("element at index-2 : " + array[2]);

		Test1 t1 = new Test1();
		try {
			System.out.println("result : "+t1.calculateInterest(2));
			
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("program ends");
}
}
