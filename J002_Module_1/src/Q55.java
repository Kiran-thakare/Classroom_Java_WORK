/*
 * Write a Java program to copy one array list into another.
 */

import java.util.ArrayList;

public class Q55 {

	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("White");
		color.add("Blue");
		color.add("Pink");
		color.add("Orange");

		ArrayList<String> list = color;

		System.out.println(list);

	}
}
