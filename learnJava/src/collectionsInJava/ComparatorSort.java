package collectionsInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {

	public static void main(String[] args) {

		integerSort();
		stringSort();

	}

	public static void integerSort() {
		List<Integer> nums = new ArrayList<>();

		nums.add(33);
		nums.add(68);
		nums.add(92);
		nums.add(15);

		System.out.println(nums);
		collectionsSort(nums);
		comparatorSort(nums);
		comparatorSortWithLamda(nums);
		System.out.println(nums);
	}

	private static void collectionsSort(List<Integer> nums) {
		Collections.sort(nums);
	}

	private static void comparatorSort(List<Integer> nums) {

		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 10 > o2 % 10)
					return 1;
				else
					return -1;
			}

		};

		Collections.sort(nums, com);
	}

	private static void comparatorSortWithLamda(List<Integer> nums) {

		Comparator<Integer> com = (o1, o2) -> {
			if (o1 % 10 > o2 % 10)
				return 1;
			else
				return -1;
		};

		Collections.sort(nums, com);
	}

	private static void stringSort() {
		List<String> str = new ArrayList<>();

		str.add("92345");
		str.add("1");
		str.add("12");
		str.add("0004");
		str.add("033");

		System.out.println(str);
		Collections.sort(str);
		System.out.println(str);
		sortStringByLength(str);
		System.out.println(str);

	}

	private static void sortStringByLength(List<String> str) {

		Comparator<String> com = (o1, o2) -> {
			if (o1.length() > o2.length())
				return 1;
			else
				return -1;
		};

		Collections.sort(str, com);
	}

}
