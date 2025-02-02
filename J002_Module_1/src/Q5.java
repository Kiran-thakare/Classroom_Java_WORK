
/*
 * Q5.Write a program in Java to input 5 numbers from keyboard and find their sum and 
  average using for loop. 
 */
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int sum = 0, avgerage = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter  Number " + i + ":");
			int num = input.nextInt();
			sum += num;
			
		}
		
		avgerage = sum / 5;
		System.out.println("Summition of Number:" + sum);
		System.out.println("Avarage Of 5 Number:" + avgerage);
	}
}
