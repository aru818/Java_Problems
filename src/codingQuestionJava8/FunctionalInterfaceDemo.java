package codingQuestionJava8;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	abstract void play(); //  no body required implementation must done in concrete class, available for all the implemeted class
	
	 static void run() { // only can be called in implemented class when reference will be of the parent class, available for only who explicitly made reference of parents, class
			
	}                     // but implementation can not be alter
	
	default void jump() { // can alter the implementation accordingly in child class , available for all
	}

}
