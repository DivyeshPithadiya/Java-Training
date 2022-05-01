package keywords.finalKeyword;

class D {
	
	final void display() {
		System.out.println("Hello");
	}
	
}

class E extends D{
	// void display() { // This will give an error because final methods can not be overridden
		
	// }
}

public class finalMethods {
		
	public static void main(String[] args) {
		E e= new E();
		e.display();
	}
	
}
