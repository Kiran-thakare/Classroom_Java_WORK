package polymorphism;

class Shape {

	void area(double r) {
		System.out.println("Area Of Circle :" + (3.14 * r * r));
	}

	void area(double length, double width) {
		System.out.println("Area Of Rectangle :" + (length * width));
	}
}

public class JavaMethodOverloading {

	public static void main(String[] args) {

		Shape s1 = new Shape();
		s1.area(4);
		s1.area(4, 5);

		String str = "Tops Technologies";
		System.out.println("Substring :" + (str.substring(3)));
		System.out.println("Substring :" + (str.substring(3, 10)));
	}
}
