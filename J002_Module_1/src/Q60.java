
/*
 * Write a Java program to associate the specified value with the specified key in a
  Hash Map.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q60 {
	public static void main(String[] args) {
		HashMap<Integer, String> list = new HashMap<Integer, String>();

		list.put(1, "Parag");
		list.put(2, "Sakshi");
		list.put(3, "Ram");
		list.put(4, "Lalit");
		list.put(5, "Saurabh");

		for(Map.Entry x:list.entrySet()) {
			System.out.println(x.getKey()+":"+x.getValue());
		}

	}
}
