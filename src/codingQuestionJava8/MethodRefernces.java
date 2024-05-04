package codingQuestionJava8;
@FunctionalInterface
public interface MethodRefernces {

	void singleAbstractMethod();

	default void printName() {

		System.out.println("welcome to my channel");
	}

	default void printName2() {
		System.out.println("welcome to my vlog");
	}

}
