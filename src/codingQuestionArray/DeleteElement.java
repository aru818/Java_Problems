package codingQuestionArray;

import java.util.HashSet;

public class DeleteElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 4, 7 };

		int targetNo = 4;
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {

			set.add(arr[i]);
			if(set.contains(targetNo)) {
				
				set.remove(targetNo);
			}
		}
		
		for (Integer numb : set) {
			System.out.print(numb+" ");
			
		}
	}
}
