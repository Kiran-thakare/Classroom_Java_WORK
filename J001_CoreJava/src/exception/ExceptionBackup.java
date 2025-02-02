package exception;

class InvalidNumberException extends Exception{
	
	private String message;

	public InvalidNumberException(String message) {
		super(message);
		this.message = message;
	}
}
class Test2{
	
	int a;
	
	void setData(int a) throws InvalidNumberException{
		if(a>0) {
			this.a = a;
		}else {
			// throw error
			throw new InvalidNumberException("Invalid Number");
		}
	}
	
	void showA() {
		System.out.println("value of a : "+a);
	}
	
}
public class ExceptionBackup {
      public static void main(String[] args) {
		 
    	  Test2 t1 = new Test2();
  		try {
  			t1.setData(-30);
  		} catch (InvalidNumberException e) {
  			e.printStackTrace();
  		}
  		t1.showA();
  		System.out.println("Program ends");
	}
}
