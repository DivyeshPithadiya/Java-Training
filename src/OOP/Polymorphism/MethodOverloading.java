package OOP.Polymorphism;

class OverloadingDemo{
	 
	OverloadingDemo() {
		System.out.println("This is my constructor");
	}
	
	void hello() {
		System.out.println("Hello");
	}
	
	void hello(int a) {
		System.out.println(a);
	}
	
	void hello(float a) {
		System.out.println(a);
	}
	
}

public class MethodOverloading {

	public static void main(String args[]) {
		
		OverloadingDemo d = new OverloadingDemo();
		d.hello();
		d.hello(5);
		d.hello(5.0f);
		
	}
}
