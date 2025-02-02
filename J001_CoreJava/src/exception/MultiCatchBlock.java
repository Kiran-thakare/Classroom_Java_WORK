package exception;

public class MultiCatchBlock {

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

		} catch (NullPointerException e) {
			System.out.println("NullPointerException Handle.");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Handle");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException Handled");
		}

		System.out.println("Program End....!");
	}
}
