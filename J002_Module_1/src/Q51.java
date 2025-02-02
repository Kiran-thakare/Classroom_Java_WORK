
/*
 *  Write a Java program to update specific array element by given element.
 */
import java.util.ArrayList;

public class Q51 {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();

		color.add("Red");
		color.add("White");
		color.add("Blue");
		color.add("Pink");

		System.out.println(color);

		color.add(1, "Green");

		System.out.println(color);

	}
}
