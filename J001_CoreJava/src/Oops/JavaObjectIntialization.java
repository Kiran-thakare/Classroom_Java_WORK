package Oops;

class Student {

	// instance variable
	int roll;
	String name;
	String course;
	double fees;

	public Student() {
		System.out.println("This is Default Constructor....!");
	}

	// Parameterized Constructor
	public Student(int roll, String name, String course, double fees) {
		this.roll = roll;
		this.name = name;
		this.course = course;
		this.fees = fees;
	}

	// Copy constructor
	Student(Student s) {
		this.roll = s.roll;
		this.name = s.name;
		this.course = s.course;
		this.fees = s.fees;
	}

	// local variable
	void setData(int roll, String name, String course, double fees) {
		this.roll = roll;
		this.name = name;
		this.course = course;
		this.fees = fees;
	}

	void display() {
		System.out.println("Roll No:" + roll);
		System.out.println("Name :" + name);
		System.out.println("Course :" + course);
		System.out.println("Fees :" + fees);
	}

}

public class JavaObjectIntialization {

	public static void main(String[] args) {

		// by reference
		Student s1 = new Student();
		s1.roll = 23;
		s1.fees = 3455.3;
		s1.name = "Parag";
		s1.course = "Java";

		s1.display();

		System.out.println("*********************");

		// by method
		Student s2 = new Student();
		s2.setData(44, "Kiran", "Flutter", 45000.0);
		s2.display();

		System.out.println("*********************");

		// by constructor
		Student s3 = new Student(55, "Jatin", "Python", 34000.0);
		s3.display();

		System.out.println("*********************");

		Student s4 = new Student(s3);
		s4.display();
	}

}
