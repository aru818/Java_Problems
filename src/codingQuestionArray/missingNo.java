package codingQuestionArray;

public class missingNo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7 };
		int n = 7;

		int sum = (n * (n + 1)) / 2;// 15
		int actSum = 0;

		for (int i = 0; i < arr.length; i++) {

			actSum = actSum + arr[i];

		}
		System.out.println("The missing no is: " + (sum - actSum));
	}
}
