package codingQuestionArray;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7,7 };

		Set<Integer> set = new HashSet<>();

		for (int a : arr) {
			set.add(a);

		}
		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {
			Integer next = itr.next();
			System.out.println(next);

		}
	}

}
