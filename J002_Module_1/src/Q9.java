/* Q9.Write a Java program to count the letters, spaces, numbers and other characters of 
an input string.
*/

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String :");
		String str = sc.nextLine();

		int isletter = 0;
		int isspace = 0;
		int isdigit = 0;
		int othercharacter = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				isletter++;
			} else if (Character.isDigit(ch)) {
				isdigit++;
			} else if (Character.isSpace(ch)) {
				isspace++;
			} else {
				othercharacter++;
			}
		}

		System.out.println("isLetter:" + isletter);
		System.out.println("isSpace:" + isspace);
		System.out.println("isDigit:" + isdigit);
		System.out.println("isOtherCharacter:" + othercharacter);

	}
}
