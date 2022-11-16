package Enums;

// enums can implement an interface but can not inherit class
// Enum outside class
enum Sim {
	AIRTEL(10, 3), VODAFONE(10, 4), JIO;
	
	Sim() {
		
	}
	
	// Enums can have variables
	int a,b;
	
	// Enums can have constructors 
	Sim(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	// Enums can have methods
	void enumMethod() {
		System.out.println("Inside enum");
	}
}


public class EnumDemo {
	 
	// Enum inside class
	enum Mobile {   
		SAMSUNG, APPLE, MI;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Mobile.APPLE);
		System.out.println(Sim.AIRTEL);
		
		System.out.println(Sim.JIO.a);
		
	}
	
}
