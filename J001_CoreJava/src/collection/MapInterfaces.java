package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapInterfaces {

	public static void main(String[] args) {

		HashMap<String, String> mMap = new HashMap<String, String>();

		// Add Element..
		mMap.put("1", "Kiran");
		mMap.put("3", "Ram");
		mMap.put("2", "Sau");

		// Length...
		System.out.println("Size:" + mMap.size());

		// iterate element
		System.out.println(mMap);

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Kiran");
		map.put(2, "Ram");
		map.put(3, "Sak");
		System.out.println(map);

		// Put is Absent
		map.putIfAbsent(3, "Akshay");

		// Get Element based on key
		System.out.println("Element for key 3:" + map.getOrDefault(3, "Tops"));

		// get keys element
		for (int key : map.keySet()) {
			System.out.println(key + "\t" + "value : " + map.get(key));
		}

		// get values
		for (String value : map.values()) {
			System.out.println(value);
		}
		// Remove
		// map.remove(2);

		// iterator
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry entry = (Entry) itr.next();
			System.out.println("Key:" + entry.getKey() + ", Value:" + entry.getValue());
		}
	}
}
