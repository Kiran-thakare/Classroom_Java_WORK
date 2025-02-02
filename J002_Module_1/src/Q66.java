/*
 *   Write a Java program to join two array lists. 
 */

import java.util.*;

public class Q66 {

	public static void main(String[] args) {

		ArrayList<Integer> num1 = new ArrayList<Integer>();

		num1.add(11);
		num1.add(22);
		num1.add(33);
		num1.add(44);
		num1.add(55);
		num1.add(66);

		ArrayList<Integer> num2 = new ArrayList<Integer>();
		num2.add(77);
		num2.add(88);
		num2.add(99);
		num2.add(100);
		num2.add(110);

		System.out.println("First ArrayList :" + num1);
		System.out.println("Secound ArrayList :" + num2);
         
		//join two array lists
		num1.addAll(num2);

		for(int i=0;i<num1.size();i++) {
			System.out.println("Index "+i+" :"+num1.get(i));
		}

	}
}
