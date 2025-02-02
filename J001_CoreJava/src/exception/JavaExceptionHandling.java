package exception;

class Test{
	int num1=10;
	int num2=30;
	void sum() {
		System.out.println("Summition Of :"+(num1+num2));
	}
}

public class JavaExceptionHandling {
  
	public static void main(String[] args) {
		System.out.println("Program starts");
		
		try {
			
			// NullPointerException
			Test t1 = new Test();
			t1.sum();
			
		}catch(NullPointerException e) {
			System.out.println("NullPointerException handled");
		}
		
		try {
			// ArrayIndexOutOfBoundException
			String names[] = {"Kiran", "Akshay", "Parag", "Jatin"};
			System.out.println("element at index 2 : "+names[4]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : "+e.getMessage());
		}
		
		try {
			
			// StringIndexOutOfBoundException
			String str = "Tops";
			
			for(int i =0; i<=str.length(); i++) {
				System.out.println(str.charAt(i));
			}
			
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		try {
			
			// Arithmetic Exception
			int num = 340;
			System.out.println(num/0);
			
		}catch(ArithmeticException e) {
			System.out.println("Error : "+e.getMessage());
		}
		
	
		try {
			
			// NumberFormatException
			String amount = "30000 Rs.";
			System.out.println(Integer.parseInt(amount)*10/100);		
			// Integer.parseInt method is used to convert String into integer
			
		}catch(NumberFormatException e) {
			System.out.println("Error : "+e.getMessage());
		}
		
		System.out.println("Program ends");
		
	}
}
