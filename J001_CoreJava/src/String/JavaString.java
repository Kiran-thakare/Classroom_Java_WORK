package String;

public class JavaString {

	public static void main(String[] args) {

		// Using String Literals....
		String name = "Kiran";

		// Creating object using new Keyword....

		String message = new String("Hello World");

		name += " Thakare";
		System.out.println("Name : " + name);

		// Upper case and Lower Case.....

		System.out.println("UpperCase String:" + name.toUpperCase());
		System.out.println("LowerCase String:" + name.toLowerCase());

		// length
		System.out.println("Length String:" + name.length());
		System.out.println("Length String:" + message.length());

		// equal And equal Ignore Case.....

		String s1 = "Tops", s2 = "tops";
		System.out.println("Equals:" + s1.equals(s2));
		System.out.println("EqualIgnoreCase:" + s1.equalsIgnoreCase(s2));

		// get Element base on index CharAt()....

		System.out.println("Char at Index 3 :" + message.charAt(3));

		// iterate String Element....

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				continue;
			}
			System.out.println("Char at index-" + i + " :" + name.charAt(i));
		}
		// convert String Using Advance For Loop
		for (char ch : name.toCharArray()) {
			System.out.print(ch + "\t");
		}
		System.out.println();

		// Trim ......
		String s3 = "Tops Techanologies";
		System.out.println("S3:" + s3.length());
		System.out.println("Using Trim:" + s3.trim().length());

		// isEmpty ,is NotEmpty and IsBlank....
		String s4 = " ";
		System.out.println("isEmpty:" + s4.isEmpty());
		System.out.println("isBlank:" + s4.isBlank());

		// IndexOf And LastIndexOf.....

		String s5 = "Tops Techanologies";
		System.out.println("Index Of P:" + s5.indexOf('p'));
		System.out.println("Index OF T:" + s5.indexOf('T'));
		System.out.println("Index OF T:" + s5.lastIndexOf('T'));

		// StartsWith And Contain....

		System.out.println("Starts With:" + s5.startsWith("T"));
		System.out.println("Starts With:" + s5.toLowerCase().startsWith("t"));
		System.out.println("Contains:" + s5.contains("og"));

		// Replace...
		System.out.println("Replace:" + s5.replace("Tops", "Hops"));

		// Substring
		System.out.println("SubString :" + s5.substring(4, 10));

		// Split.....
		String msg = "This Is My Home";
		String[] arr = msg.split(" ");
		for (String array : arr) {
			System.out.println(array);
		}
		// Join
		String[] languages = { "Java", "Kotlin", "Dart" };
		System.out.println("Join:" + String.join("-", languages));

		// Format:
		float amount = 3455.4f;
		System.out.println("Format :" + String.format("Value of Amount =%.2f", amount));

		// Reverse

		System.out.println("Message:" + message);
		StringBuilder builder = new StringBuilder(message);
		System.out.println("Reverse:" + builder.reverse().toString());
		
		
		
		
		
	}
}
