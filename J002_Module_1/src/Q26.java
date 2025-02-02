/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. Its 
constructor having parameters for length and breadth is used to initialize the length 
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
constructor having a parameter for its side (suppose s) calling the constructor of its 
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square

*/
class Rectangle {
	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void area() {
		double ar = length * breadth;
		System.out.println("Area :" + ar);
	}

	void areaParimeter() {
		double perimeter = 2 * (length + breadth);
		System.out.println("Area of  perimeter :" + perimeter);
	}

}

class Square extends Rectangle {

	public Square(double side) {
		super(side,side);
	}

}

public class Q26 {

	public static void main(String[] args) {

		Rectangle rec=new Rectangle(10, 4);
		rec.area();
		rec.areaParimeter();
		
		
		Square sq = new Square(4);
		sq.area();
		sq.areaParimeter();
	}
}
