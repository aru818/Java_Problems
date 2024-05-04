package comparableAndComperator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TextComparator {
	public static void main(String[] args) {
		String text1 = "This is a lengthy text with some words.";
		String text2 = "This is another lengthy text with different words.";

		String[] words1 = text1.split("\\s+");
		String[] words2 = text2.split("\\s+");

		Set<String> set1 = new HashSet<>(Arrays.asList(words1));
		Set<String> set2 = new HashSet<>(Arrays.asList(words2));

		// Find mismatched words
		Set<String> mismatchedWords = new HashSet<>(set1);
		mismatchedWords.addAll(set2);
		mismatchedWords.removeAll(set1);
		mismatchedWords.retainAll(set2);

		System.out.println("Mismatched words: " + mismatchedWords);
	}
}
