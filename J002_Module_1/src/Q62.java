/*
 *  Write a Java program to reverse elements in an array list. 
 */

import java.util.ArrayList;
import java.util.Collections;

public class Q62 {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(22);
		num.add(44);
		num.add(66);
		num.add(88);
		num.add(11);
		num.add(99);

		System.out.println("Numbers:" + num);
		
		Collections.reverse(num);
		
		System.out.println("Reverse Order:"+num);

	}
}
