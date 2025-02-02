
/*
 *  Write a Java program that accepts an integer (n) and computes the value of 
		n+nn+nnn. Input number: 5 
		5 + 55 + 555 
 */
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter N:");
		int n = input.nextInt();

		int nn = n * 10 + n;

		int nnn = nn * 10 + n;

		System.out.println("computes the value of n+nn+nnn+:-" + n + "+" + nn + "+" + nnn);

	}
}
