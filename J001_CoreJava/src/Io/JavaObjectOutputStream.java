package Io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class JavaObjectOutputStream {

	private static final String DIRNAME = "Program";
	private static final String FileName = "Student.txt";
	private static final String Path = "D://";

	public static void main(String[] args) {
		Student s1 = new Student(1, "Kiran", "Java");

		File dir = new File(Path, DIRNAME);

		if (!dir.exists()) {
			if (dir.mkdir()) {
				System.out.println("Directory Created....");
			} else {
				return;
			}
		}
		saveText(s1, dir);

	}

	private static void saveText(Student student, File dir) {
		FileOutputStream fout = null;
		ObjectOutputStream out = null;

		try {
			fout = new FileOutputStream(dir + File.separator + FileName);
			System.out.println("Path:" + (dir + File.separator + FileName));
			out = new ObjectOutputStream(fout);
			out.writeObject(student);
			System.out.println("Object Save Succcesfully");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			try {

				out.close();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
