package codingQuestionCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntoCollection {
	public static void main(String[] args) {
		Integer [] arr=  {1,2,3,4,5,6};
		
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(list);
		
	}

}
