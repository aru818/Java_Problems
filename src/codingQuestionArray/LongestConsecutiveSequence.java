package codingQuestionArray;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
//1235789
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8 };
		int longNum = 0;
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(arr[i] - 1)) {

				int no = arr[i];
				while (set.contains(no)) {

					no++;
				}
				if (longNum < no - arr[i]) {
					longNum = no - arr[i];

				}
			}

		}
		System.out.println("The Longest Consecutive Sequence is: " + longNum);
	}

}
