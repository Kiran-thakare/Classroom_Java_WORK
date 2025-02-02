import java.util.Scanner;

public class Fibbonacci_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number :");
		int num = sc.nextInt();

		int n1 = 0, n2 = 1, n3 = 0;

		for (int i = 0; i <= num; i++) {
			n3 = n1 + n2;
			System.out.println(n3);

			n1 = n2;
			n2 = n3;
		}
	}
}
