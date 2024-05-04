package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableClass {
	public static void main(String[] args) {
		
		
		List<Emp> emp= new ArrayList<>();
		
		
		emp.add(new Emp(9, "Brvind"));
		emp.add(new Emp(4, "Arvind"));
		emp.add(new Emp(7, "crvind"));
		
		Collections.sort(emp,new IdComparator());
		System.out.println(emp);
		
	}
	

	
}
