package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person1 {
	private int id;
	private String name;
	private int age;

	public Person1(int id, String name, int age) {

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

}

class AgeComparator implements Comparator<Person1> {

	@Override
	public int compare(Person1 o1, Person1 o2) {
		if (o1.getAge() > o2.getAge()) {
			return 1;
		} else if (o1.getAge() < o2.getAge()) {
			return -1;
		}
		return 0;
	}

}

class NameComparator implements Comparator<Person1> {

	@Override
	public int compare(Person1 o1, Person1 o2) {

		return o1.getName().compareTo(o2.getName());
	}

}

public class JavaComparator {

	public static void main(String[] args) {

		ArrayList<Person1> list = new ArrayList<Person1>();

		list.add(new Person1(1, "Karan", 20));
		list.add(new Person1(2, "Rahul", 28));
		list.add(new Person1(3, "Akshay", 27));
		list.add(new Person1(4, "Parag", 26));

		Collections.sort(list, new AgeComparator());

		for (Person1 p : list) {
			System.out.println("Id:" + p.getId() + "  Name:" + p.getName() + "  age:" + p.getAge());
		}
		System.out.println("***********************************");
		Collections.sort(list, new NameComparator());

		for (Person1 p : list) {
			System.out.println("Id:" + p.getId() + "  Name:" + p.getName() + "  age:" + p.getAge());
		}
	}
}
