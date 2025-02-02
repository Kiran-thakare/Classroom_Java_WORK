package encapsulation;

class Student {

	private int id;
	private String name;
	private String course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}

public class JavaEncapsulation {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Sau");
		s1.setCourse("Java");

		System.out.println("id:" + s1.getId());
		System.out.println("Name:" + s1.getName());
		System.out.println("Course:" + s1.getCourse());
	}
}
