package codingQuestionString;

public class Palindrome {

	public static boolean isPalindrome(String str) {

		int left = 0;
		int right = str.length()-1;

		while (right > left) {

			if (str.charAt(right) != str.charAt(left)) {

				return false;
			}

			left++;
			right--;

		}
		return true;
	}

	public static void main(String[] args) {

		String input = "madam";

		if (isPalindrome(input)) {
			System.out.println(input + " is a palindrome");
		} else {
			System.out.println(input + " is not a palindrome");
		}

	}
}
