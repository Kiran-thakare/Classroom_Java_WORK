package Io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaFileReader {

	private static final String DIRNAME = "Program/Tops";
	private static final String FileName = "Sample.txt";
	private static final String Path = "D:\\";

	public static void main(String[] args) {

		FileReader reader = null;

		File file = new File(new File(Path, DIRNAME), FileName);

		try {
			reader = new FileReader(file);
			BufferedReader r = new BufferedReader(reader);
			String line;
			StringBuilder builder = new StringBuilder();
			while ((line = r.readLine()) != null) {
				builder.append(line);
			}
			System.out.println("Message:" + builder.toString());
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
