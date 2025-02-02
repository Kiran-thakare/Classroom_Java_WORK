/*
 * Q3.Write a Java program that takes a year from user and print whether that year is a leap 
    year or not.
 */

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Year:");
		int year = input.nextInt();
		if (year % 4 == 0) {
			System.out.println("This Year is Leap Year.....!");
		} else {
			System.out.println("This Year is Common Year....!");
		}
	}
}
