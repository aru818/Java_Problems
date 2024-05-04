package comparableAndComperator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(6);

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {

			Integer next = iterator.next();
			System.out.println(next);

			if (next.equals(4)) {

				iterator.remove();

			}
		}
		System.out.println(list);
	}
}
