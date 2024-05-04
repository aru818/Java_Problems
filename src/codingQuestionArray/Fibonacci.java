package codingQuestionArray;

public class Fibonacci {
//0 1 1 2 3 5 8 13
	public static void main(String[] args) {
		int n = 15;
		int first = 0;
		int second = 1;
		System.out.println(" The Fibonacci series is : ");

		for (int i = 0; i < n; i++) {

			System.out.print(first + " ");

			int next = first + second;

			first = second;
			second = next;

		}

	}

}
