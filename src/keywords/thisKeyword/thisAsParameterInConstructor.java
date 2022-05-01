package keywords.thisKeyword;


class Bike {
	
	Truck obj;
	
	Bike(Truck obj) {
		this.obj=obj;
	}
	
	void display() {
		System.out.println(obj.name);
		System.out.println(obj.speed);
	}
	
}

class Truck {
	
	int speed=40;
	String name="TATA";
	
	Truck() {
		Bike b = new Bike(this);
		b.display();
	}
}

public class thisAsParameterInConstructor {
	
	public static void main(String args[]) {
		Truck t=new Truck();
	}

}
