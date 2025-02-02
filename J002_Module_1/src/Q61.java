
/*
 * Write a Java program to count the number of key-value (size) mappings in a map.
 */

import java.util.HashMap;
import java.util.Map;

public class Q61 {

	public static void main(String[] args) {

		Map<Integer, String> list =new HashMap<Integer, String>();

		list.put(1, "Parag");
		list.put(2, "Sakshi");
		list.put(3, "Ram");
		list.put(4, "Lalit");
		list.put(5, "Saurabh");

		int mapSize = list.size();

		System.out.println("Key And Value Size:" + mapSize);

	}
}
