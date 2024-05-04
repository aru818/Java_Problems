package codingQuestionString;

import java.util.HashMap;
import java.util.Map;

public class NotRepeatedChar {
	public static void main(String[] args) {

		String str = "Ssuhanii";
		String string = str.toUpperCase();
		int count = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (char c : string.toCharArray()) {
			if (map.containsKey(c)) {
				count = map.get(c);
				map.put(c, count + 1);

			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				Character key = entry.getKey();
				Integer value = entry.getValue();

				System.out.println(key + " :  " + value);
			}

		}

	}

}
