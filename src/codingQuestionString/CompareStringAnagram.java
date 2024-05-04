package codingQuestionString;

import java.util.Arrays;

public class CompareStringAnagram {
	public static void main(String[] args) {

		
		 boolean result = isAnagram("arvind", "vindar");
		 System.out.println(result);
	}

	public static boolean isAnagram(String str1, String str2) {

		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		//if (Arrays.equals(arr1, arr2) && str1.length() == str2.length()) 
		if (Arrays.equals(arr1, arr2) && arr1.length == arr2.length)
		{

			return true;
		}

		return false;
	}

}
