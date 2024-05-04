package codingQuestionArray;

public class MissingNumber {

	public static int missingNumber(int[] arr) {
	    int n = arr.length + 1;

		int arraySum = 0;

		int sum = n * (n + 1) / 2;

		for (int a : arr) {

		arraySum = a + arraySum;
		}

		return sum - arraySum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8 };
		int mn = missingNumber(arr);
		System.out.println("The missing no in given array is: " + mn);
	}

}
