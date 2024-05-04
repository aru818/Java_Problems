package codingQuestionString;

import java.util.ArrayList;
import java.util.List;

public class ReplaceCharAtOccur {
public static void main(String[] args) {
        String str = "Arvindd";
        char[] strArray = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c : strArray) {
        list.add(c);
        }
        char targetChar = 'd'; // Character to be replaced
        char replacementChar = 'M'; // Character to replace with
        for (int i = 0; i < list.size(); i++) {
        if (list.get(i) == targetChar) {
        list.set(i, replacementChar);
            }
        }
        System.out.println("------------Character in the String of form --------");
		  StringBuilder modifiedStr = new StringBuilder(); 
		  for (char c : list) {
		  modifiedStr.append(c); }
		  
		  System.out.println(modifiedStr.toString());
		 
        System.out.println("------------Character in the list of form --------");
       
        System.out.println(list);
    }
}
