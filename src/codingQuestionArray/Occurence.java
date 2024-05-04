package codingQuestionArray;

import java.util.HashMap;
import java.util.Map;

public class Occurence {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 3, 5, 7,7 };

		findDuplicates(arr);

	}

	public static void findDuplicates(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {

				int count = map.get(arr[i]);

				map.put(arr[i], count + 1);
				
				//break;
			} else {
				map.put(arr[i], 1);

			}

		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			Integer key = entry.getKey();
			Integer value = entry.getValue();
			if(value>1)
			System.out.println(key + " occurs " + value);
			
			

		}
	}
}
