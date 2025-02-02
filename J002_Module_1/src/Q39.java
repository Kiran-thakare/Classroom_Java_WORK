/*
 * W.A.J. P to demonstrate try catch block, take two numbers from the user by 
	Command line argument and perform the division operation and handle Arithmetic 
	O/P- 
	Exception in thread main java. Lang. Arithmetic Exception:/ by zero 
 */

import java.util.Scanner;

public class Q39 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter Two Numbers:");

			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			int result = num1 / num2;

			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Exception in thread \"main\" java.lang.ArithmeticException: / by zero");
		}
	}
}
