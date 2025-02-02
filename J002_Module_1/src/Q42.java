/*
 * W.A.J.P to create a class Student with attributes roll no, name, age and course. 
	Initialize values through parameterized constructor. If age of student is not in 
	between 15 and 21 then generate user defined exception 
	"AgeNotWithinRangeException". If name contains numbers or special symbols 
	raise exception "NameNotValidException". Define the two exception classes. 
 */
class AgeNotWithinRangeException extends Exception {
	private String message;

	public AgeNotWithinRangeException(String message) {
		super(message);
		this.message = message;
	}

}

class NameNotValidException extends Exception {
	private String message;

	public NameNotValidException(String message) {
		super(message);
		this.message = message;
	}

}

class Student {

	private int rollno;
	private String name;
	private int age;
	private String Course;

	public Student(int rollno, String name, int age, String course)
			throws AgeNotWithinRangeException, NameNotValidException {
		super();
		if (age < 15 || age > 21) {
			throw new AgeNotWithinRangeException("student is not in	between 15 and 21 then");
		}
		if (!name.matches("[a-z/A-Z]+")) {
			throw new NameNotValidException("NameNotValidException");
		}
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.Course = course;
	}

	void showInfo() {
		System.out.println("student Roll No :" + rollno);
		System.out.println("Student Name :" + name);
		System.out.println("Student Age:" + age);
		System.out.println("Student Course:" + Course);
	}

}

public class Q42 {
	public static void main(String[] args) {

		try {
			Student s1 = new Student(1, "2Ram", 15, "Java");
			s1.showInfo();

		} catch (AgeNotWithinRangeException e) {

			e.printStackTrace();
		} catch (NameNotValidException e) {
			e.printStackTrace();
		}
		try {
			Student s2 = new Student(2, "Parag", 18, "Java");
			s2.showInfo();

		} catch (AgeNotWithinRangeException e) {

			e.printStackTrace();
		} catch (NameNotValidException e) {
			e.printStackTrace();
		}
		try {
			Student s3 = new Student(3, "Akshay", 22, "Java");
			s3.showInfo();

		} catch (AgeNotWithinRangeException e) {

			e.printStackTrace();
		} catch (NameNotValidException e) {
			e.printStackTrace();
		}

	}
}
