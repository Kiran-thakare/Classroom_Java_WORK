package Io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInputStreamReader {
	private static final String DIRNAME = "Program";
	private static final String FileName = "Sample.txt";
	private static final String Path = "D:\\";

	public static void main(String[] args) {

		FileInputStream in = null;

		File root = new File(Path, DIRNAME);
		File file = new File(root, FileName);

		try {
			in = new FileInputStream(file);
			InputStreamReader input = new InputStreamReader(in);
			BufferedReader r = new BufferedReader(input);
			String line;
			StringBuilder builder = new StringBuilder();
			while ((line = r.readLine()) != null) {
				builder.append(line);
			}
			System.out.println("Message :" + builder.toString() + "\n");

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
