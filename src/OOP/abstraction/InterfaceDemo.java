package OOP.abstraction;

interface Employee {
	
	public void working();
	public void sleeping();
	
}

class EmloyeeImpl implements Employee {

	public void working() {
		System.out.println("Working");
	}

	public void sleeping() {
		System.out.println("Sleepiing");
	}
	
	public void display() {
		working();
		sleeping();
	}
}

class InterfaceDemo {
	public static void main(String args[]) {
		Employee e=new EmloyeeImpl();
		
		e.working();
		e.sleeping();
 	}
}
