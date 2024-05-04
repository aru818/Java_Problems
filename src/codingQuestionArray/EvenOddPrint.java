package codingQuestionArray;

import java.util.ArrayList;

public class EvenOddPrint {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 9, 2 };

		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				evenList.add(arr[i]);

			} else {
				oddList.add(arr[i]);
			}

		}

		for (Integer odd : oddList) {
			System.out.println("List of odd no: " + odd + " ");
		}
		for (Integer even : evenList) {
			System.out.println("List of even no: " + even + " ");
		}
	}

}
