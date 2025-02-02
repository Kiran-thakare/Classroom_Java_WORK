/*
 * Write a Java program to compare two sets and retain elements which are same on 
    both sets.
 */

import java.util.HashSet;
import java.util.Set;

public class Q73 {

	public static void main(String[] args) {
		Set<String> colorA = new HashSet<String>();
		colorA.add("Red");
		colorA.add("White");
		colorA.add("Blue");
		colorA.add("Pink");
		colorA.add("Silver");

		System.out.println(colorA);

		Set<String> colorB = new HashSet<String>();
		colorB.add("Red");
		colorB.add("Green");
		colorB.add("Blue");
		colorB.add("Mercury");
		colorB.add("Silver");

		System.out.println(colorB);

		Set<String> compare = new HashSet<String>(colorA);

		compare.retainAll(colorB);

		System.out.println("After Compare color:" + compare);

	}
}
