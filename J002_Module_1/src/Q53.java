import java.util.ArrayList;

public class Q53 {

	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("White");
		color.add("Blue");
		color.add("Pink");
		color.add("Orange");

		System.out.println(color);

		if (color.contains("Orange")) {
			System.err.println("Color is Here ....!!");
		} else {
			System.out.println("Color is Not For ArrayList");
		}
	}
}
