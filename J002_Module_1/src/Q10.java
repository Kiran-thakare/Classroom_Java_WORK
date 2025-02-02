
//Q10.Write a Java program to print the ASCII value of a given character. 

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Character :");
		int ch = input.next().charAt(0);

		System.out.println("ASCII value of a given character :" + ch);

	}
}
