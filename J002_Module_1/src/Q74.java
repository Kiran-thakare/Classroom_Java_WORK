/*
 *  Write a Java program to get a collection view of the values contained in this map. 

 */

import java.util.HashMap;
import java.util.Map;

public class Q74 {

	public static void main(String[] args) {

		Map<Integer, String> color = new HashMap<Integer, String>();
		color.put(1, "Red");
		color.put(2, "Green");
		color.put(3, "Blue");
		color.put(4, "Purple");
		color.put(5, "Gold");

		System.out.println("Values:" + color.values());

	}
}
