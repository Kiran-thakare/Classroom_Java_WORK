/*
 * Write a program to print the factorial of a number by defining a method named 
'  Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*. 
* (n-1) *n. E.g.- 
   4! = 1*2*3*4 = 24 
   3! = 3*2*1 = 6 
   2! = 2*1 = 2 
   Also, 1! = 1 
   0! = 0 
 * 
 */
 public class Q32 {

	public static void main(String[] args) {
		
		int num1=4;
		int num2=3;
		int num3=2;
		int num4=1;
		int num5=0;
		
		System.out.println(num1+"!=1+2+3+4="+factorialNumber(num1));
		System.out.println(num2+"!=1+2+3=="+factorialNumber(num2));
		System.out.println(num3+"!=1+2"+factorialNumber(num3));
		System.out.println(num4+"!="+factorialNumber(num4));
		System.out.println(num5+" ! ="+factorialNumber(num5));
		
		
	}

	static int factorialNumber(int num) {
		
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
	
}
