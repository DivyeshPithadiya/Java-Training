package keywords.superKeyword;

class Car {
	
	Car() {
		System.out.println("Car constuctor");
	}
	
	int speed=40;
	String name="Car";
	int b=20;
	
	
	void display() {
		System.out.println("This is Car");
		System.out.println(speed);
		System.out.println(name);
	}
	
}

class Suv extends Car {
	int speed=50;
	String name="SUV";
	
	Suv() {
		 super();// super with constructor
		
	}
	
	void display() {
		System.out.println("This is SUV");
		System.out.println(speed);
		System.out.println(name);
	}
	
	void print() {
		super.display(); // super with method
		System.out.println(super.name); // super with variables
	}
	
}


public class superDemo {
	public static void main(String args[]) {
		Suv s=new Suv();
		s.print();
	}
}
