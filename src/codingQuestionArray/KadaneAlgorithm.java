package codingQuestionArray;

//maximum sum of a subArray within an array of integers
//This code is not applicable when all the elements are negative
public class KadaneAlgorithm {
	public static void main(String[] args) {
		int[] arr = { 1, 2, -3, 4, 5, 2, -7 };
		int currentSum = 0;
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {

			currentSum = currentSum + arr[i];

			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
			if (currentSum <= 0) {

				currentSum = 0;
			}

		}
		System.out.println(maxSum);

	}
}
