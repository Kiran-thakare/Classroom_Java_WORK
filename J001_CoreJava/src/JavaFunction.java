import java.util.Random;

public class JavaFunction {

	public static void main(String[] args) {

		System.out.println("Program starts");

//		greetings();
//		greetings("Jatin");
//		greetings("Kiran");
//		greetings("Akshay");
//
		drawPattern(5);
		drawPattern(10);
		int number = getRandomNumber(100, 500);
		System.out.println("Random Value: " + number);

		number = getRandomNumber(500, 1000);
		System.out.println("Random Value: " + number);

		boolean result = isValidContact("8766787654");
		System.out.println("Result :" + result);

		if (isValidContact("8766787654")) {
			System.out.println("Given Number Is Valid...!!!!!");
		} else {
			System.out.println("Given Number Is Invalid.....!!!!");
		}

		System.out.println("Program ends here");
	}

	// without parameter and without return type
	static void greetings() {
		System.out.println("Namaste Sir / Madam .....!!!");
	}

	// with parameter and without return type
	static void greetings(String name) {
		System.out.println("Namaste " + name);
	}

	static void drawPattern(int row) {

		for (int n = 1; n <= row; n++) {

			for (int i = row - n; i >= 1; i--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static int getRandomNumber(int start, int end) {
		int random = new Random().nextInt(start, end);
		return random;
	}

	static boolean isValidContact(String contact) {
		return contact.length() == 10;
	}
}
