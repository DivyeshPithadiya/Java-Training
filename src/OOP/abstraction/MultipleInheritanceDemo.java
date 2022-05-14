package OOP.abstraction;

interface A {
	public void display();
}

interface D {
	public void display();
}

class C implements A,D {
	
	public void display() {
		System.out.println("Multiple inheritance");
	}
}

public class MultipleInheritanceDemo {
	
	public static void main(String[] args) {
		C c =new C();
		c.display();
	}

}
