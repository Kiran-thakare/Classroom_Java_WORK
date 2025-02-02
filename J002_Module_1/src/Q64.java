/*
 * Write a Java program to compare two array lists. 
 */

import java.util.ArrayList;

public class Q64 {
	public static void main(String[] args) {

		ArrayList<Integer> num1 = new ArrayList<Integer>();

		num1.add(22);
		num1.add(44);
		num1.add(66);
		num1.add(88);
		num1.add(11);
		num1.add(99);

		ArrayList<Integer> num2 = new ArrayList<Integer>();
		num2.add(22);
		num2.add(44);
		num2.add(66);
		num2.add(88);
		num2.add(11);
		num2.add(99);
		
		boolean isequal=num1.equals(num2);

		if (isequal) {
			System.out.println("Both Lists Are Same..");
		} else {
			System.out.println("Diffrent Lists");
		}
	}
}
