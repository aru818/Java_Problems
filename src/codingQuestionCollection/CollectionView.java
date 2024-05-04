package codingQuestionCollection;

import java.util.HashMap;

public class CollectionView {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(4, "Arvind");

		hmap.put(5, "Sumit");

		hmap.put(6, "Rajeev");

		System.out.println(hmap);
		System.out.println(hmap.values());
	}
}
