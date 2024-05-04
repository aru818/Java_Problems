package codingQuestionArray;
import java.util.ArrayList;

public class CommonElmTwoArray {
public static void main(String[] args) {
	int[] arr1 = {1,3,5,6,9};
	int[] arr2 = {1,5,3,6,9};
	
	ArrayList<Integer> arrayList= new ArrayList<>();
	
	for(int i=0; i<arr1.length;i++) {
		
		for(int j=0; j<arr2.length;j++) {
			
			if(arr1[i]==arr2[j]) {
				
				arrayList.add(arr1[i]);
			}
		}
		
	}
	System.out.print("common no in both the array are: ");
	for (int  commonNum   : arrayList) {
		
		System.out.print( commonNum+ " ");
	}
	
}
}
