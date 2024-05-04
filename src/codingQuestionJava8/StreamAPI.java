package codingQuestionJava8;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
public static void main(String[] args) {
	List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8,9,55);
	
	List<Integer> evenNum = list.stream().filter(n-> n%2==0 ).collect(Collectors.toList()); // filter is predicate which only works when condition is true
	System.out.println(evenNum);
	
	List<Integer> numBig50 = list.stream().filter(n-> n>=50).collect(Collectors.toList());
	
	System.out.println(numBig50);
	
	list.stream().map(i-> i*5).forEach(i->System.out.print(i+ " "));
	
	System.out.println("________________________");
	
	list.stream().sorted().forEach(System.out:: print);
	System.out.println("________________________");
	
	Integer min = list.stream().min((x,y)-> x.compareTo(y)).get();
	System.out.println(min);
	System.out.println("________________________");
	Integer max = list.stream().max((x,y)-> x.compareTo(y)).get();
	System.out.println(max);
	System.out.println("________________________");
	List<Integer> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(reverseOrder);
}

}
