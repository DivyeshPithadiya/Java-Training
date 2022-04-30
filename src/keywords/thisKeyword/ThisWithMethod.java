package keywords.thisKeyword;

class Employee {
	
	void working() {
		System.out.println("Working");
	}
	
	void sleeping() {
		System.out.println("Sleeping");
	}
	
	void callingMthod() {
		working();
		this.sleeping();
	}
	
}

public class ThisWithMethod {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.callingMthod();
	}
}
