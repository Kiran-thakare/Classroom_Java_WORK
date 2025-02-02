import java.util.Scanner;

public class JavaUserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Num1:");
		int num1 = scanner.nextInt();
		System.out.print("Enter Num2:");
		int num2 = scanner.nextInt();
		int sum = num1 + num2;
		System.out.println("The Addition Of Two Numbers:" + sum);

		// Character
		System.out.print("Enter Character:");
		char ch = scanner.next().charAt(0);
		System.out.println("Character:" + ch);

		// Integer :
		System.out.print("Enter Age");
		int age = scanner.nextInt();
		System.out.println("Number:" + age);
		// Float
		System.out.print("Enter Salary");
		double salary = scanner.nextDouble();
		System.out.println("Salary:" + salary);
		scanner.nextLine();
		// String
		System.out.print("Enter Name:");
		String name = scanner.nextLine();
		System.out.println("Name:" + name);
	}
}
