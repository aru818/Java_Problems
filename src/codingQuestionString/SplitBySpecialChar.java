package codingQuestionString;
public class SplitBySpecialChar {
	public static void main(String[] args) {
		String str = "hey@ram@help@me@out";
		String[] split = str.split("@");
		for (String a : split) {
			System.out.println(a);
		}
	}

}
