package codingQuestionString;

public class ReverseString {
	public static void main(String[] args) {
		String str = "ArvindVerma";

		char[] charArray = str.toCharArray();

		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			char temp = charArray[left];

			charArray[left] = charArray[right];

			charArray[right] = temp;

			left++;
			right--;
		}

		String modifiedStr = new String(charArray);

		System.out.println("Modified array:  " + modifiedStr);
		
		System.out.println("__________________");
		String string = charArray.toString();
		System.out.println(string);
		

	}

}
