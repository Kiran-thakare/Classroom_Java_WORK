package exception;

public class JavaExceptionClass {

	public static void main(String[] args) {

		System.out.println("Program Start");

		try {
			// NullPointerException
			Test t1 = null;
			t1.sum();

			// Arithmetic Exception
			int num = 340;
			System.out.println(num / 0);

			// NumberFormatException
			String amount = "3000 Rs";
			System.out.println(Integer.parseInt(amount) * 10 / 100);
			/*
			 * Integer.parseInt method is used to convert String into integer
			 */

		} catch (Exception e) {
			System.out.println("Error :" + e.getMessage());
		} finally {
			System.out.println("Finally Block Executed...");
		}
		System.out.println("Program End....!");
	}
}
