/*
 * W.A.J.P to create the validate method that takes integer value as a parameter. If the 
	age is less than 18, then throw an Arithmetic Exception otherwise print a message 
	welcome to vote. 
	O/P- Enter your age: 16 
	Exception in thread main java. Lang. Arithmetic Exception: not valid
 */

import java.util.Scanner;

public class Q40 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age:");
		int age = sc.nextInt();

		try {
			validateAge(age);
			System.out.println("Welcome Vote");

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

	static void validateAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not Valid For Vote ");
		}
	}
}
