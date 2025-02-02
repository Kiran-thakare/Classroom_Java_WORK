
/*
 * Write a Java program to get the number of elements in a hash set.
 */
import java.util.HashSet;

public class Q59 {
	public static void main(String[] args) {

		HashSet<Integer> number = new HashSet<>();

		number.add(22);
		number.add(44);
		number.add(55);
		number.add(33);
		number.add(11);
		number.add(66);

		System.out.println("the number of elements in a hash set. :" + number.size());

	}
}
