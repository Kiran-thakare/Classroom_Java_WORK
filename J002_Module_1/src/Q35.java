/*Create a class named 'Shape' with a method to print "This is this is shape". Then 
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both 
having a method to print "This is rectangular shape" and "This is circular shape" 
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print 
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the 
object of 'Square' class. 

*/

class Shape1 {

	public void printShape() {
		System.out.println("This is this is shape");
	}
}

class Rectangle1 extends Shape1 {

	public void printRecgtangle() {
		System.out.println("This is rectangular shape");
	}
}

class Square1 extends Rectangle1 {

	public void printSquare() {
		System.out.println("Square is a rectangle");
	}
}

class Circle1 extends Shape1 {

	public void printCircle() {
		System.out.println("This is circular shape");
	}
}

public class Q35 {

	public static void main(String[] args) {

		Square1 sq = new Square1();

		sq.printShape();
		sq.printRecgtangle();
		sq.printSquare();
	}
}
