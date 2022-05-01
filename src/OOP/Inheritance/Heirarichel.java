package OOP.Inheritance;


class Bank {
	
	void employees() {
		System.out.println("There are some employees");
	}
}

class Sbi extends Bank{
	
	void name() {
		System.out.println("SBI");
	}
}

class Axis extends Bank {
	
	void name() {
		System.out.println("Axis");
	}
}

class Bob extends Bank {
	void name() {
		System.out.println("BOB");
	}
}

public class Heirarichel {

	public static void main(String[] args) {
		
		Sbi s=new Sbi();
		s.employees();
		s.name();
		
		Axis a=new Axis();
		a.employees();
		a.name();
		
		Bob b= new Bob();
		b.employees();
		b.name();
		
	}
}
