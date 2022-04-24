package OOP.Inheritance;


class A {
	
	int a=10;
	int b=20;
	
	void sum() {
		System.out.println("Sum is: "+(a+b));
	}
	
}

class B extends A{
	
}

public class SingleLevel {

	public static void main(String args[]) {		
		B single = new B();
		single.sum(); // Method calling
	}
	
}
