package Constructors;

class ConstructorDemo {

	ConstructorDemo () {
		System.out.println("Hello");
	}
	
	ConstructorDemo(int a,int b) {
		System.out.println("Sum is: "+(a+b));
	}
	
	ConstructorDemo(float a,int b) {
		System.out.println("Sum is: "+(a+b));
	}
	
}

public class HelloConstructor {

	public static void main(String args[]) {
		ConstructorDemo c= new ConstructorDemo(2,3);
		ConstructorDemo c1= new ConstructorDemo();
		ConstructorDemo c2= new ConstructorDemo(2.0f,5);		
	}
	
}
