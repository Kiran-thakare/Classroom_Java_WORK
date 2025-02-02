package Io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class JavaObjectInputStream {

	private static final String DIRNAME = "Program";
	private static final String FileName = "Student.txt";
	private static final String Path = "D://";

	public static void main(String[] args) {

		FileInputStream fin = null;
		ObjectInputStream in = null;

		File file = new File(new File(Path, DIRNAME), FileName);
		System.out.println("Path "+file.getAbsolutePath());

		try {
			fin = new FileInputStream(file);
			in = new ObjectInputStream(fin);
			
			

			Student student = (Student) in.readObject();

			if (student != null) {
				System.out.println("Id:" + student.getRoll());
				System.out.println("Name:" + student.getName());
				System.out.println("Course:" + student.getCourse());

			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} finally {
           if(in!=null || fin !=null) {
        	   try {
				in.close();
				fin.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
        	   
           }
		}

	}
}
