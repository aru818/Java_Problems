package codingQuestionArray;

import java.util.Arrays;

public class InsertElement {
	public static void main(String[] args) {

		// insert at 4th index a element 10

		int[] arr = { 1, 2, 3, 4, 5, 4, 7 };

		for (int i = arr.length - 1; i > 4; i--) {

			arr[i] = arr[i - 1];

			// here second last index value comes in last elements and so on
			// Basically all values shifted one to one like ArrayList

		}
		arr[4] = 10;
		

		System.out.println(Arrays.toString(arr));
	}
}
