package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class JavaSet {

	public static void main(String[] args) {

		TreeSet<String> languageset = new TreeSet<String>();
		languageset.add("Java");
		languageset.add("Python");
		languageset.add("C");
		languageset.add("C++");
		languageset.add("MySQL");

		for (String s : languageset) {
			System.out.println(s);
		}
		languageset.remove("MySQL");
		System.out.println(languageset);
		
		Iterator itr=languageset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
