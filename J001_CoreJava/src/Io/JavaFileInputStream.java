package Io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaFileInputStream {
	private static final String DIRNAME = "Program";
	private static final String FileName = "Sample.txt";
	private static final String Path = "D:\\";

	public static void main(String[] args) {

		FileInputStream in = null;

		//File root = new File(Path, DIRNAME);
		File file = new File(new File(Path, DIRNAME), FileName);

		try {
			in = new FileInputStream(file);
			int i;
			StringBuilder builder = new StringBuilder();

			while ((i = in.read()) != -1) {
				builder.append((char) i);
			}

			System.out.println("Message : " + builder.toString());

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}
	}
}
