package abstraction;

abstract class Shape {

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void showColor() {
		System.out.println("Color :" + color);
	}

	abstract void area();

}

class Circle extends Shape {

	private double radius;

	public Circle(double radius) {

		this.radius = radius;
	}

	@Override
	void area() {
		System.out.println("Area of Circle :" + (3.14 * radius * radius));
	}

}

class Rectangle extends Shape {

	private double length, width;

	public Rectangle(double length, double width) {

		this.length = length;
		this.width = width;
	}

	@Override
	void area() {

		System.out.println("Area of Rectangle  :" + (length * width));
	}

}

public class JavaAbstractClass {

	public static void main(String[] args) {

		Circle c = new Circle(4);
		c.setColor("Red");
		c.showColor();

		Rectangle rec = new Rectangle(4, 5);
		rec.setColor("White");
		rec.showColor();

		c.area(); // This will call circle class area method
		rec.area(); // This will call Rectangle class area method
	}
}
