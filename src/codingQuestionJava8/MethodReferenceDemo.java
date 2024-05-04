package codingQuestionJava8;

public class MethodReferenceDemo {
public static void main(String[] args) {
	
	
	  MethodRefernces reference= Test:: testImplementation;  // method to be call
	  reference.singleAbstractMethod(); 					// method to be referenced (it is abstract method)
	 
	
	/*
	 * MethodRefernces reference =()->
	 * System.out.println("This is lambda expression");
	 * reference.singleAbstractMethod();
	 */
}
}
