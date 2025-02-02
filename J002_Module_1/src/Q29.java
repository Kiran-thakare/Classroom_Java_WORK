/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
having a method with the same name 'message' that prints "This is first subclass" 
and "This is second subclass" respectively. Call the methods 'message' by creating 
an object for each subclass. 

*/

abstract class Parent1 {

	abstract void message();
}

class Child1 extends Parent1 {

	@Override
	void message() {
		System.out.println("This is first subclass");

	}
}

class Child2 extends Parent1 {

	@Override
	void message() {

		System.out.println("This is Secound subclass");
	}

}

public class Q29 {

	public static void main(String[] args) {

		Child1 ch1 = new Child1();
		ch1.message();

		Child2 ch2 = new Child2();
		ch2.message();
	}
}
