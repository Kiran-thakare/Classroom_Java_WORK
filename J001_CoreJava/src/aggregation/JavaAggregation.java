package aggregation;

class Student {
	int roll;
	String name;
	String course;
	Address address;

	public Student(int roll, String name, String course, Address address) {
		this.roll = roll;
		this.name = name;
		this.course = course;
		this.address = address;
	}

	void showDisplayInfo() {
		System.out.println("Roll :" + roll);
		System.out.println("Name :" + name);
		System.out.println("Course:" + course);
		System.out.println("Address:" + address.city + "," + address.state + "," + address.pincode);
	}
}

class Address {
	String city;
	String state;
	String pincode;

	public Address(String city, String state, String pincode) {
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

}

public class JavaAggregation {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Kiran", "Java", new Address("Gujrat", "Surat", "394210"));
		s1.showDisplayInfo();
	}
}
