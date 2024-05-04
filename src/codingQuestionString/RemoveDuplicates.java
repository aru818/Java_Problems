package codingQuestionString;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static String removeChar(String str) {
		StringBuilder sb = new StringBuilder();
		Set<Character> s = new HashSet<>();
		for (char c : str.toCharArray()) {
			if (!s.contains(c)) {
				sb.append(c);
				s.add(c);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(removeChar("jonnyrrsc"));
	}

}
