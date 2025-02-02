package polymorphism;

class A {

	void show() {
		System.out.println("A class Show Method call");
	}

	// overridden method
	void draw() {
		System.out.println("Drawing Circle...");
	}
}

class B extends A {

	// overriding method

	void draw() {
		super.draw();
		System.out.println("Drawing Rectangle..");
	}
}

public class JavaMethodOverriding {

	public static void main(String[] args) {

		B obj = new B();
		obj.show();
		obj.draw();
	}
}
