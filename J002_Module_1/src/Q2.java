/* Q2. Write a Java program that takes the user to provide a single character from the 
alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
message. 
*/

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Character:");
		char ch = input.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
			System.out.println("This Character is Vovel....!");
		} else {
			System.out.println("This Character is Consonant");
		}

	}
}
