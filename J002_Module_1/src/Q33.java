/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 'Area' and 
call all the three methods
*/

abstract class Shape {

	abstract double RectangleArea(double length, double breadth);

	abstract double SquareArea(double side);

	abstract double CircleArea(double radius);
}

class Area extends Shape {

	@Override
	double RectangleArea(double length, double breadth) {
		return length * breadth;
	}

	@Override
	double SquareArea(double side) {

		return side * side;
	}

	@Override
	double CircleArea(double radius) {

		return 3.14 * radius * radius;
	}

}

public class Q33 {

	public static void main(String[] args) {

		Area ar = new Area();

		System.out.println("RectangleArea:" + ar.RectangleArea(5, 6));
		System.out.println("SquareArea :" + ar.SquareArea(6));
		System.out.println("CircleArea:" + ar.CircleArea(5));
	}
}
