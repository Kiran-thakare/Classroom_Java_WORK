package collection;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	public int compareTo(Person o) {
//		
//		return this.name.compareTo(o.name);
//	}

	@Override
	public int compareTo(Person o) {
		if (this.age > o.age) {
			return 1;

		} else if (this.age < o.age) {
			return -1;

		}
		return 0;
	}

}

public class JavaComparable {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();

		list.add(new Person(1, "Karan", 20));
		list.add(new Person(2, "Rahul", 28));
		list.add(new Person(3, "Akshay", 27));
		list.add(new Person(4, "Parag", 26));

		Collections.sort(list);

		for (Person p : list) {
			System.out.println("Id:" + p.getId() + "  Name:" + p.getName() + "  age:" + p.getAge());
		}
	}
}
