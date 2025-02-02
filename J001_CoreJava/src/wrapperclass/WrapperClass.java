package wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {

		int num = 45;
		Integer number = 67; // creating object of Integer class

		System.out.println("num : " + num);
		System.out.println(number.intValue()); // convert Integer into int
		int max=Integer.max(66, 22);
		System.out.println("Max Value :"+max);

	}
}
