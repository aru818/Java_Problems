	package codingQuestionString;

import java.util.HashMap;
import java.util.Map;

public class OccuranceCharacter {

	public static void main(String[] args) {

		String str = "Vanshika";
		
		Map<Character, Integer> mp = new HashMap<>();

		for (char c : str.toCharArray()) {

			if (mp.containsKey(c)) {

				int count = mp.get(c);

				mp.put(c, count + 1);
			} else {
				mp.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
			char ch = entry.getKey();
			int counted = entry.getValue();
			System.out.println("Occurance of character " + ch + " is " + counted);

		}

	}
}
