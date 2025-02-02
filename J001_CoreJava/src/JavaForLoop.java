import java.util.Scanner;

public class JavaForLoop {

	public static void main(String[] args) {
		/*
		 * for(initialization; condition; inc/dec) { statement }
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row:");
		int row = sc.nextInt();
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
