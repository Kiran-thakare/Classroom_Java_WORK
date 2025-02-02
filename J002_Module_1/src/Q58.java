/*
 * Write a Java program to iterate through all elements in a hash list
 */

import java.util.HashSet;
import java.util.Iterator;

public class Q58 {

	public static void main(String[] args) {

		HashSet<Integer> number = new HashSet<>();

		number.add(22);
		number.add(44);
		number.add(55);
		number.add(33);
		number.add(11);
		number.add(66);

		Iterator<Integer> itr = number.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println(number.getClass());

	}
}
