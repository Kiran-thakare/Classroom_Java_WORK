package abstraction;

interface Vehicle {

	void start();

	void stop();

	void accelarate();

	void doBreak();
}

class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Bike Start...");
	}

	@Override
	public void stop() {

		System.out.println("Bike Stop...");

	}

	@Override
	public void accelarate() {

		System.out.println("Bike Accelarate...");

	}

	@Override
	public void doBreak() {

		System.out.println("Bike Break...");

	}

}

class Car implements Vehicle {

	@Override
	public void start() {

		System.out.println("Car Start...");
	}

	@Override
	public void stop() {

		System.out.println("Car Stop...");
	}

	@Override
	public void accelarate() {

		System.out.println("Car Accelerate ....");

	}

	@Override
	public void doBreak() {

		System.out.println("Car Break ....");
	}

}

public class JavaInterface {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		c.accelarate();
		c.doBreak();

	System.out.println(" ************************* ");
		Bike b = new Bike();
		b.start();
		b.stop();
		b.accelarate();
		b.doBreak();

	}
}
