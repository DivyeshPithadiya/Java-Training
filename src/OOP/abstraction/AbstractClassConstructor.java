package OOP.abstraction;


abstract class Demo {
	Demo() {
		System.out.println("Demo");
	}
}

class B extends Demo{
	B() {
		super();
	}
}

public class AbstractClassConstructor {

	public static void main(String args[]) {
		B b =new B();

	}
	
}
