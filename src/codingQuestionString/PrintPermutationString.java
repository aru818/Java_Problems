package codingQuestionString;

public class PrintPermutationString {
	public static void main(String[] args) {
		

	}
	
	public static void permutation(String str) {
		//cat
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			char c= arr[i];
			
			String substringleft = str.substring(0, i);
			String substringright = str.substring(i+1);
			//String final= substringleft+substringright;
			
		}
	}
}
