/*
 * Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 
 5 units by creating a class named 'Triangle' without any parameter in its constructor. 
 * 
 */

class Triangle {

	private int side1 = 3;
	private int side2 = 4;
	private int side3 = 5;

	public Triangle() {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	void printArea() {
		double area = side1 + side2 + side3;
		System.out.println("Area :" + area);
	}

	void printParimeterTriangle() {
		double parimeter = (side1 + side2 + side3) / 2.0;
		System.out.println("perimeter of a triangle :" + parimeter);
	}

}

public class Q27 {

	public static void main(String[] args) {
		Triangle ti = new Triangle();
		ti.printArea();
		ti.printParimeterTriangle();
	}
}
