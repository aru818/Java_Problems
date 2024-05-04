package codingQuestionString;

public class SpecialCharachter {
	public static void main(String[] args) {

		String str = "Arvind@!#";

		String specialCharacterRemoved = "";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (!Character.isAlphabetic(str.charAt(i)) && !Character.isDigit(str.charAt(i))
					&& !Character.isWhitespace(str.charAt(i))) {

				count++;
			} else {
				specialCharacterRemoved = specialCharacterRemoved + str.charAt(i);
			}
		}
		if (count == 0) {

			System.out.println("No special charater found");
		} else {
			System.out.println("No of special character found: " + count);
		}
		System.out.println("Special character removed String: " + specialCharacterRemoved);
	}

}
