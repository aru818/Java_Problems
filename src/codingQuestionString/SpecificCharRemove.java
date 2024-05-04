package codingQuestionString;

public class SpecificCharRemove {
public static void main(String[] args) {

	String str = "Hello";
	StringBuilder sb= new StringBuilder(str);
	
	sb.deleteCharAt(0);
	System.out.println(sb);
	
	
}

}