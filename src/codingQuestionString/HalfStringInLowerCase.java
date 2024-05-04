package codingQuestionString;

public class HalfStringInLowerCase {

	public static void main(String[] args) {
		String str = "arvindarvind";

		StringBuilder sb1 = new StringBuilder();
		
		StringBuilder sb2 = new StringBuilder();
		
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {

			char c = arr[i];
			sb1.append(c);

		}

		for (int i = (arr.length / 2) ; i < arr.length; i++) {

			char ch = arr[i];
			sb2.append(ch);

		}
		String str1 = sb1.toString().toLowerCase();
		String str2 = sb2.toString().toUpperCase();
		System.out.println("First Half of the String: " + str1);
		System.out.println("First Half of the String: " + str2);
	}

}
