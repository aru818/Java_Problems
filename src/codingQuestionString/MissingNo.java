package codingQuestionString;

public class MissingNo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7 };
		int n = 7;

		int targetedSum = n * (n + 1) / 2;
		int actualSum = 0;

		for (int a : arr) {
			actualSum = actualSum + a;

		}
		System.out.println(targetedSum - actualSum);
	}
}
