package keywords.thisKeyword;

class Car {
	
	String name="SUV";
	int mileage= 40;
	
	void carDetails(Car c) {
		System.out.println(c.name);
		System.out.println(c.mileage);
	}
	
	void printDetails() {
		this.carDetails(this);
	}
	
}


public class thisAsParameter {
	public static void main(String[] args) {
		Car c=new Car();
		c.printDetails();
	}
}
