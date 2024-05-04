package codingQuestionString;

public class CompareStringAnagram2 {

	public static void main(String[] args) {

		boolean result = isAnagram("abc", "acb");
		System.out.println(result);

	}

	public static boolean isAnagram(String str1, String str2) {

		char[] arr = str1.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			char c = arr[i];
			if (str2.contains(Character.toString(c)) && str1.length() == str2.length()) {

				return true;
			}
		}

		return false;
	}
}
