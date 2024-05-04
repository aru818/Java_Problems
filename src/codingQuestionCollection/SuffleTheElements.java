package codingQuestionCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuffleTheElements {
	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('f');

		System.out.println("Original List: " + list);

		Collections.shuffle(list);

		System.out.println("Suffled List: " + list);

	}
}
