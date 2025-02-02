package Io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFileWriter {

	private static final String DIRNAME = "Program/Tops";
	private static final String FileName = "Sample.txt";
	private static final String Path = "D:\\";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Message:");
		String message = sc.nextLine();

		File dir = new File(Path, DIRNAME);

		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("Directory Created...");
		} else {
			System.out.println("Already here....");
		}

		savefile(message, dir);
	}

	private static void savefile(String message, File dir) {
		File file = new File(dir, FileName);

		FileWriter write = null;

		try {
			write = new FileWriter(file);
			write.write(message.toCharArray());

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (write != null) {
				try {
					write.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
