package codingQuestionArray;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 8, 7, 9, 1,9 };

		int temp ;
		for (int i = 0; i < arr.length-1 ; i++) {
		for(int j= i+1; j<arr.length;j++) {
			
			if(arr[i]>arr[j]) {
				
				temp= arr[i];
			    arr[i]= arr[j]; // here arr[i] is empty and filled with arr[j] value
				arr[j]=temp;    // here arr[j] is empty and filled with arr[i] value which is in temp
				
			}
			
		}

		}
		System.out.println((arr[arr.length-2]));
		
	}

}
