package OOP.Inheritance;


class Animal {
	
	int number=10;
	String color="Brown";
	void eat() {
		System.out.println("Eating");
	}
}

class Dog {

	void dogData() {
		Animal a= new Animal();
		a.eat();
	}
	
	void bark() {
		System.out.println("Barking");
	}
}

public class HasA {
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.dogData();
		d.bark();
		
//		Animal a=new Animal();
//		String data=a.color;
//
//		System.out.println(data);
		
	}
	
}
