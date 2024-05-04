package codingQuestionCollection;

import java.util.TreeSet;

public class ClonnedTreeSet {
	public static void main(String[] args) {

		TreeSet<Integer> tset = new TreeSet<>();

		tset.add(4);
		tset.add(5);
		tset.add(6);
		tset.add(7);

		System.out.println("Original Tset--------------");
		System.out.println(tset);

		System.out.println("Tset clone 1---------------------");
		TreeSet<Integer> clonnedTset = new TreeSet<>(tset);
		System.out.println(clonnedTset);

		System.out.println("Tset clone 2----------------------");
		TreeSet<Integer> clonnedTset2 = new TreeSet<>();
		clonnedTset2.addAll(tset);
		System.out.println(clonnedTset2);
	}
}
