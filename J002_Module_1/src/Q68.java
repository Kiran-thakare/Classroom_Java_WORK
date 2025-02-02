/*
 *  Write a Java program to convert a hash set to a List/Array List. 
 */
import java.util.ArrayList;
import java.util.HashSet;

public class Q68 {

	public static void main(String[] args) {

		HashSet<String> color = new HashSet<String>();

		color.add("Red");
		color.add("Blue");
		color.add("Green");
		color.add("White");
		color.add("Silver");

		ArrayList<String> list = new ArrayList<String>(color);

		System.out.println(list);

		System.out.println("index 0f:"+list.get(0));
	}
}
