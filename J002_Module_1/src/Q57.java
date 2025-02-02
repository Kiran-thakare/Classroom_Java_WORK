
/*
 * Write a Java program to append the specified element to the end of a hash set.
 */
import java.util.HashSet;

public class Q57 {
	public static void main(String[] args) {

		HashSet<String> color = new HashSet<>();
		color.add("Red");
		color.add("Blue");
		color.add("Green");
		color.add("Orange");

		System.out.println(color);

		// Append
		String newelement = "Silver";

		color.add(newelement);

		System.out.println(color);

	}
}
