package codingQuestionArray;

public class FindMaxMinValue {

	public static void main(String[] args) {

		int[] arr = { 1, 23, 5, -1, 44, 42 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i <= arr.length - 1; i++) {

			if (arr[i] > max) {

				max = arr[i];

			}
			if (arr[i] < min) {

				min = arr[i];

			}

		}

		System.out.println(max);
		System.out.println(min);
	}

}
