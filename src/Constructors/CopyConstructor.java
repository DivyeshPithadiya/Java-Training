package Constructors;


class Car {
	
	String name;
	String company;
	
	Car() {
		
	}
	
	// Copy constructor
	public Car(Car c) {
		this.name=c.name;
		this.company=c.company;
	}
	
}

public class CopyConstructor {
	
	public static void main(String[] args) {
		Car obj =new Car();
		
		obj.name="SUV";
		obj.company="TATA";
		
		Car c2=new Car(obj);
		System.out.println(c2.name);
		System.out.println(c2.company);
		
	}

}
