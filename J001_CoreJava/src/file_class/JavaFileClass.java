package file_class;

import java.io.File;
import java.util.Scanner;

public class JavaFileClass {

	private final static String DIRNAME = "Tops";
	private final static String FILENAME = "sample.txt";
	private final static String ROOT = "D:\\Top's Tech";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int choice;

		System.out.println("1. create a file");
		System.out.println("2. read data from file");
		System.out.println("Enter your choice :");

		choice = scanner.nextInt();

		switch (choice) {

		case 1:

			createFile();

			break;
		case 2:
			break;
		default:
			System.out.println("invalid input.");
		}

	}

	private static void createFile() {

		try {

			File dir = new File(ROOT, DIRNAME);

			// System.out.println("path : "+dir.getAbsolutePath());

			if (!dir.exists()) {
				dir.mkdir(); // create directory if not exist
				System.out.println("Directory (" + dir.getName() + ") created.");
			}

			File file = new File(dir, FILENAME);
			if (!file.exists()) {

				if (file.createNewFile()) {
					System.out.println("File (" + file.getName() + ") created");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
