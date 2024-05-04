package staticMethodInterface;

public interface Child extends Parent{
	public interface Parent {
		public static void work() {
			
			System.out.println("Child");
		}
	}
	
	
	public static void main(String[] args) {
		Parent.work();
	}
}
