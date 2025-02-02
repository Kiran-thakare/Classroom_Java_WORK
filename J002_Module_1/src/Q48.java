/*
 * Write a Java program to create a new array list, add some colors (string) and print out
  the collection.
 */

import java.util.ArrayList;

public class Q48 {
	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("White");
		color.add("Blue");
		color.add("Pink");

		for (String c : color) {
			System.out.println("Color:" + c);
		}
	}

}
