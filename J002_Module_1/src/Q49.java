import java.util.ArrayList;
import java.util.Iterator;

public class Q49 {
	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("White");
		color.add("Blue");
		color.add("Pink");

		Iterator<String> itr = color.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}
}
