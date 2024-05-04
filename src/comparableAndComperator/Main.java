package comparableAndComperator;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {


		int []	arr= {1,8,5,2,6};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Student [] std = new Student[5];
		std[0]= new Student(5,"Amit");
		std[1]= new Student(6,"Sumit");
		std[2]= new Student(9,"Anuj");
		std[3]= new Student(11,"Rohit");
		std[4]= new Student(7,"Rajeev");

		Arrays.sort(std);
		System.out.println(Arrays.toString(std));


		Arrays.sort(std, Student.nameComparator);
		System.out.println(Arrays.toString(std));



	}
}
