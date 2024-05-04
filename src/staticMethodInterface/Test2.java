package staticMethodInterface;

public class Test2 extends Test1{
	
	
	public int id= 3;
	public String name;

	
	
	public static void work() {
		System.out.println("hare Rama hare krishna");
		
		
	}
	
public static void main(String[] args) {
	
	Test1 t = new Test2();
	
	System.out.println(t.id);
	
	work();
}
}
