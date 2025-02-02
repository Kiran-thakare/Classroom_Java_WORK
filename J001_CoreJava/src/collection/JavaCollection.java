package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 	syntax to create object of an ArrayList
 * 	
 * 	int num = 34;
 * 	int nums[] = new int[34];
 * 	Student s = new Student();
 * 	ArrayList<Student> objName = new ArrayList<Student>();
 * 
 */

public class JavaCollection {

	public static void main(String[] args) {

		// Creating Object Of ArrayList Class

		ArrayList<Integer> numlist = new ArrayList<Integer>();
		numlist.add(55);
		numlist.add(33);
		numlist.add(22);

		System.out.println(numlist);

		ArrayList<String> colorlist = new ArrayList<String>();
		colorlist.add("Black");
		colorlist.add("Red");
		colorlist.add("Blue");
		

		System.out.println(colorlist);

		// Size.....
		System.out.println("Length Of Colorlist:" + colorlist.size());
		System.out.println(colorlist);

		// Remove....
		// colorlist.remove("Yellow"); //Remove Based On element
		colorlist.remove(2);
		System.out.println(colorlist);
		/*
		 * //iterate element using for loop for(int i=0;i<colorlist.size();i++) {
		 * System.out.println("Element index "+i+":"+colorlist.get(i)); }
		 */
		// Iterate element using advanced for loop

		for (String color : colorlist) {
			System.out.println(color);
		}

		System.out.println("*****************************************");

		colorlist.add("Yellow");
		colorlist.add("Green");
		colorlist.add("Pink");
		colorlist.add(2, "yellow");
		System.out.println(colorlist);

		// indexOf and lastIndexof
		System.out.println("index of Purple :" + colorlist.indexOf("Yellow"));
		System.out.println("index of Purple :" + colorlist.lastIndexOf("yellow"));
		int index = colorlist.indexOf("yellow");

		// update
		colorlist.set(index, "Pink");
		colorlist.add(index, "red");
		System.out.println(colorlist);

		// contain
		System.out.println("Contains :" + colorlist.contains("ink"));

		// clear
		// colorlist.clear();

		// Reverse
		System.out.println("Reverse :" + colorlist.reversed());

		// Sort ascending and Descending

		Collections.sort(colorlist);
		System.out.println(colorlist);

		Collections.sort(colorlist, Collections.reverseOrder());
		System.out.println(colorlist);
  	 //toArray convert arraylist to array
//		System.out.println("Array"); 
//		colorlist.toArray();

		List<String> sublist = colorlist.subList(2, 5);
		System.out.println(sublist);

		// Shuffle
		Collections.shuffle(colorlist);
		System.out.println(colorlist);

	}
}
