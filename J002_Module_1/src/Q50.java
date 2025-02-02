
/*
 *  Write a Java program to retrieve an element (at a specified index) from a given array
    list.
 */
import java.util.ArrayList;

public class Q50 {
	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Green");
		color.add("Black");

		for (int i = 0; i < color.size(); i++) {
			System.out.println("Color " + i + ":" + color.get(i));
		}

	}
}
