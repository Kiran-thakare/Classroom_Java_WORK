/*
 *  W.A.J.P to check whether a given string ends with the contents of another string. 
      "Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True
 */
public class Q16 {

	public static void main(String[] args) {

		String s1 = "Java Exercises";
		String s2 = "Java Exercise";

		System.out.println("Java Exercises ends with 'se':-" + s1.endsWith("se"));
		System.out.println("Java Exercises ends with 'se':-" + s2.endsWith("se"));
	}
}
