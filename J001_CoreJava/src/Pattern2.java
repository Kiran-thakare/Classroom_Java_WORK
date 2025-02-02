
public class Pattern2 {

	public static void main(String[] args) {
		int line = 5;
		int spacecount = line - 1;

		for (int i = 0; i <= line; i++) {
			for (int j = 0; j <= line-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
