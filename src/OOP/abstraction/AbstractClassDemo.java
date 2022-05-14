package OOP.abstraction;


abstract class Student {
	
	String name="Divyesh";
	String sname="Pithadiya";
	
	abstract void display();
	
	void printDetails() {
		System.out.println(name);
		System.out.println(sname);
	}
	
}

class StudentImpl extends Student{
	
	void display() {
		System.out.println("School student");
	}
	
}

public class AbstractClassDemo {
	
	public static void main(String[] args) {
		Student s= new StudentImpl();
		s.display();
		s.printDetails();

		
	}
}
