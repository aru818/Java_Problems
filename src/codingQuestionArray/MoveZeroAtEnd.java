package codingQuestionArray;

import java.util.Arrays;

// to more clarity go: https://www.youtube.com/watch?v=k5lIW5XxC7g

public class MoveZeroAtEnd {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 0, 5, 0, 0, 8, 0 };
		int count = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if ((arr[i] != 0)) {
				arr[count] = arr[i];    //12358
				count++; //     count =4              
			}
		}
		
		while (count < arr.length) {  // count=4
			arr[count++] = 0;         // at the index 5 value will be stored as 0	
		}

		System.out.println(Arrays.toString(arr));
	}
}
