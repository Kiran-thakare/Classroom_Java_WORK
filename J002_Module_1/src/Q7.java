/*
 *  Write a program in Java to make such a pattern like right angle triangle with number 
    increased by 1 The pattern like: 
		1 
		2 3 
		4 5 6 
		7 8 9 10
 */

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 1;
		System.out.print("Enter Row:");
		int row = input.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}
}
