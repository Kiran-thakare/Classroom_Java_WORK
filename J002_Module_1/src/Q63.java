/*
 *  Write a Java program to extract a portion of an array list.
 */

import java.util.ArrayList;

public class Q63 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(22);
		num.add(44);
		num.add(66);
		num.add(88);
		num.add(11);
		num.add(99);

		System.out.println("Numbers:" + num);

		System.out.println("extract a portion of:" + num.subList(2, 4));
	}
}
