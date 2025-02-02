/*
 * Q8.Write a Java program that reads a positive integer and count the number of digits the 
   number. 
	Input an integer number less than ten billion: 125463 
	Number of digits in the number: 6 
 */

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int count = 0;
		System.out.print("Input an integer number less than ten billion:");
		int num = input.nextInt();

		while (num > 0) {
			num = num / 10;
			count++;
		}

		System.out.println("Number of digits in the number: " + count);

	}
}
