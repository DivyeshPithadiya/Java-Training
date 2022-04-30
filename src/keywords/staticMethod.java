package keywords;


class Employee {
	static void working() {
		System.out.println("Employees are working");
	}
}

public class staticMethod {

	static void working() {
		System.out.println("Main Employees are working");
	}
	
	static int a=10;
	
	public static void main(String[] args) {
		working();
		Employee.working();
		System.out.println(a);
	}
	
}
