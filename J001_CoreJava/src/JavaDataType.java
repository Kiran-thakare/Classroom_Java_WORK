
public class JavaDataType {

	
/*
	Java datatype

*	int, double , float , long , char, byte , short  - primitive 
*	String , Class Object - non primitive type 
*
*	int, byte, short, long - whole number  (ex. 45, 23, -12) 
*	double, float -	 (ex. -23, 23.6)
*	char - '@'
*	boolean - true, false
*	
*	String - sequence of characters  ("rahul", "surat")
*
*/
public static void main(String[] args) {
		
		byte month = 2;
		short num1 = 3333;
		int num2 = 3333333;				// default
		long num3 = 333333333333L;
		
		float PI = 3.14f;
		double amount = 34454.45;		// default 
		
		char ch = '@';
		
		boolean isChecked = true;
		String message = "Java is amazing..";
		
		System.out.println("month : "+month);
		System.out.println("num : "+num2);
		System.out.println("value of PI : "+PI+".");
		System.out.println("amount : "+amount);
		System.out.println("ch : "+ch);
		System.out.println(isChecked);
		System.out.println(message);
		
	}
}
