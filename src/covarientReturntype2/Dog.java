package covarientReturntype2;

public class Dog extends Animal {
	
	
	/*
	 * public Dog() { super(); System.out.println("hello"); }
	 */

	public Dog eat() {
		System.out.println("Dog can eat veg and nonveg");
		
		return new Dog();
	}

}
