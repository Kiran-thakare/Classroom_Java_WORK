/*
 * Q13.Write a Java program to print numbers between 1 to 100 which are divisible
 *  by 3, 5 and by both. 
 */
public class Q13 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			boolean divisible3 = i % 3 == 0;
			boolean divisible5 = i % 5 == 0;

			if (divisible3 && divisible5) {
				System.out.println(i + " both Of divisible by 3 and 5.");
			} else if (divisible3) {
				System.out.println(i + " divisible by 3");
			} else if (divisible5) {
				System.out.println(i + " divisible by 5");
			}

		}
	}
}