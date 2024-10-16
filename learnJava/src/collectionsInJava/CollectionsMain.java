package collectionsInJava;

import java.util.ArrayList;
import java.util.List;

public class CollectionsMain {

	public static void main(String[] args) {
		collectionsBasics();
	}
	
	private static void collectionsBasics() {

		List<String> fruits = new ArrayList<>();
		fruits = List.of("1", "2");
		System.out.println(fruits);

		/*
		 * fruits = Arrays.asList("Apple","Citrus"); System.out.println(fruits); //
		 * fruits.add("abc"); // java.lang.UnsupportedOperationException fruits.set(0,
		 * "abc"); System.out.println(fruits);
		 */

	}

}
