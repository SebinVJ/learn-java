package codingProblems;

import java.util.HashSet;

public class TargetFinder {

	public static void main(String[] args) {
		
		System.out.println(findNumbers(new int [] {10,20,30,10}, 40));

	}

	public static boolean findNumbers(int[] arr, int targetNum) {

		HashSet<Integer> processedList = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			int reqNum = targetNum - arr[i];
			System.out.println("Num 1:" + arr[i] + "   Num 2:" + reqNum);
			if (processedList.contains(reqNum)) {
				return true;
			} else {
				processedList.add(arr[i]);
			}
		}
		return false;
	}

}
