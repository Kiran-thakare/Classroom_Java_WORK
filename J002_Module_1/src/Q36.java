/*
 *  W.A.J. P to demonstrate try catch block, 
   • Take two numbers from the user and perform the division operation and handle 
     Arithmetic Exception. O/P- Enter two numbers: 10 0 
     Exception in thread main java.lang.ArithmeticException:/ by zero 
 */

import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number First:");
		int num1=sc.nextInt();
		System.out.print("Enter Number Seound:");
		int num2=sc.nextInt();
		
		try {
			
			int result=num1/num2;
			
			System.out.println("The division operation :"+result);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException Exception Handled");
		}
		
		
	}
}
