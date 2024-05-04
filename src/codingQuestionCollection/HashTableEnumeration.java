package codingQuestionCollection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEnumeration {
	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<>();

		ht.put(1, "A");
		ht.put(5, "b");
		ht.put(3, "c");

		Enumeration<Integer> enm = ht.keys();

		while (enm.hasMoreElements()) {
			Integer nextElement = enm.nextElement();
			String value = ht.get(enm);
			System.out.println(nextElement + ":" + value);

		}

	}
}
