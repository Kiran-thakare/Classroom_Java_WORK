/*
 * Q1.Write a Java program to Take three numbers from the user and print the greatest 
    number. 
 */

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.print("Enter Number1:");
		int num1 = obj.nextInt();
		System.out.print("Enter Number2:");
		int num2 = obj.nextInt();
		System.out.print("Enter Number3:");
		int num3 = obj.nextInt();

		if (num1 > num2) {
			System.out.println("Number 1 is Greater than Number 2");

		} else if (num2 > num3) {
			System.out.println("Number 2 is Greater than Number 3");
		} else {
			System.out.println("Number 3 is Greater than Number 1 and Number 2 ");
		}

	}
}
