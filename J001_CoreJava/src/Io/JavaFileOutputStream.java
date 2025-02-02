package Io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class JavaFileOutputStream {

	private static final String DIRNAME = "Program";
	private static final String FileName = "Sample.txt";
	private static final String Path = "D://";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Meesage:");
		String message = scanner.nextLine();

		File dir = new File(Path, DIRNAME);

		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("Directory Created Succesfully.....");
		} else {
			return;

		}
		saveText(message, dir);

	}

	private static void saveText(String message, File dir) {
		File file = new File(dir, FileName);

		FileOutputStream out = null;

		try {
			out = new FileOutputStream(file, true);
			out.write(message.getBytes());

			System.out.println("Data Enter Successfully....");
		} catch (FileNotFoundException e) {
			System.out.println("Error : File not found.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
