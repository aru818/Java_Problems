package codingQuestionArray;

public class PlusOne {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 9 };

		for (int i = arr.length - 1; i > arr.length - 2; i--) {
			if (arr[arr.length - 1] == 9) {
				arr[arr.length - 2] = arr[arr.length - 2] + 1;
				arr[arr.length - 1] = 0;

			} else {
				arr[arr.length - 1] = arr[arr.length - 1] + 1;
			}

		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}
}
