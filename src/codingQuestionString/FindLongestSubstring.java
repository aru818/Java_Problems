package codingQuestionString;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindLongestSubstring {

	public static void main(String[] args) {
		longSubstring("bcdefdgh");
	}

	public static void longSubstring(String str) {
		String longestSubstring = "";
		int maxLength = 0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (!map.containsKey(c)) {
				map.put(c, i);
			} else {

				i = map.get(c); // i=2 and iteration will start from i+1 , means from d
				map.clear();
			}
		}

		// Check the last potential substring after the loop finishes
		/*
		 * if (map.size() > maxLength) { maxLength = map.size(); longestSubstring =
		 * str.substring(map.get(str.charAt(0)), str.length()); }
		 */
		if (map.size() > maxLength) {
			maxLength = map.size();
			longestSubstring = map.keySet().toString();
		}

		System.out.println("Longest substring: " + longestSubstring);
		System.out.println("Length: " + maxLength);
	}
}
