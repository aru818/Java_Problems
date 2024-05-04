package codingQuestionString;

public class DesiredInput {
	public static void main(String[] args) {
		String input = "A,1,B,2,C,3";// A1B2C3
		String[] arr = input.split(",");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < arr.length; i += 2) {

			stringBuilder.append(arr[i]).append("-").append(arr[i + 1]).append(",");
		}
        // to delete extra commas
		if (stringBuilder.length() > 0) {
			stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		}
		String string = stringBuilder.toString();
		System.out.println(string);
	}
}
