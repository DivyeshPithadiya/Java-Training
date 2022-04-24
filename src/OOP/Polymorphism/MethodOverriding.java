package OOP.Polymorphism;

class Animal {
	void color() {
		System.out.println("Color of Animal is black");
	}
}

class Dog extends Animal{
	
	void color() {
		System.out.println("Color of Dog is Brown");
	}
	
	void bark() {
		System.out.println("Barking");
	}
	
	
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		Animal d=new Dog();
		d.color();	
		// d.bark() //Will give an error
	}

}
