package codingQuestionArray;

import java.util.Arrays;

public class FindSecondLargestNo {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 3, 9, 9, 9,7 };
		// 234599

		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {

			if (arr[i] != arr[arr.length - 1]) {

				System.out.println(arr[i]);
				return;
			}
		}
		System.out.println("not found");
	}

}
