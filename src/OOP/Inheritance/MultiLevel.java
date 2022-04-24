package OOP.Inheritance;

class GrandParent {
	void nose() {
		System.out.println("Nose");
	}
}

class Parent extends GrandParent{
	void eye() {
		System.out.println("Eye");
	}
}

class Child extends Parent{
	
	void ear() {
		System.out.println("Ear");
	}	
}

public class MultiLevel {
	public static void main(String[] args) {
		Child c = new Child();
		c.ear();
	}
}
