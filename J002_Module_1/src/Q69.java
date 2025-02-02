/*
 *  Write a Java program to check whether a map contains key-value mappings (empty) 
   or not. 
 */

import java.util.HashMap;
import java.util.Map;

public class Q69 {
	public static void main(String[] args) {

		Map<Integer, String> employe = new HashMap<Integer, String>();

		employe.put(1, "Kiran");
		employe.put(2, "Sau");
		employe.put(3, "Ram");

		System.out.println(employe);
		
		//employe.clear();

		if (employe.isEmpty()) {
			System.out.println("Not Found Element.....");

		} else {
			System.out.println("Element here...");
		}

	}
}
