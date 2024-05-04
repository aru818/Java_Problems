package codingQuestionCollection;

import java.util.ArrayList;

public class JoinTwoArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>();

		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(5);
		alist.add(6);

		ArrayList<Integer> alist2 = new ArrayList<>();

		alist.add(5);
		alist.add(7);
		alist.add(9);
		alist.add(3);
		alist.add(2);

		ArrayList<Integer> alistMain = new ArrayList<>();

		alistMain.addAll(alist);
		alistMain.addAll(alist2);

		for (Integer a : alistMain) {
			System.out.println(a);
		}

	}
}
