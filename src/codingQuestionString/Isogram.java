package codingQuestionString;

public class Isogram {
	static public boolean isIsogram(String str) {

		str = str.toLowerCase();

		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i++) {

			for (int j = i + 1; j < c.length; j++) {

				if (c[i] == c[j]) {

					return false;
				}

			}

		}

		return true;
	}

	public static void main(String[] args) {

		String string = "Shivangi";

		/*
		 * if (isIsogram(string)) { System.out.println(string + " is a isogram");
		 * 
		 * } else { System.out.println(string + " is not a isogram"); }
		 */
		
		boolean isogram = isIsogram(string);
		System.out.println(isogram);
	}
}
