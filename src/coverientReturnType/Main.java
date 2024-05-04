package coverientReturnType;

public class Main {
	public static void main(String[] args) {

		Animal animal = new Dog();

		Object breed = animal.breed();

		System.out.println(breed);

	}
}
