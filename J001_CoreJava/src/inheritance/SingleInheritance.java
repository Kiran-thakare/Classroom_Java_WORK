package inheritance;

class Person {
	int id;
	String name;
}

class Student extends Person {
	String course;
	double fees;

	void show() {
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
		System.out.println("Course:" + course);
		System.out.println("Fees:" + fees);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 1;
		s1.name = "Kiran";
		s1.course = "Java";
		s1.fees = 65000.0;
		s1.show();
	}
}
