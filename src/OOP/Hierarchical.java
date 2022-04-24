package OOP;


class Bank {
	
	void bankDetails() {
		System.out.println("This is Bank");
	}
	
}

class Sbi extends Bank{
	
	void bankMain() {
		System.out.println("SBI");
	}
	
}

class Bob extends Bank{
	
	void bankMain() {
		System.out.println("BOB");
	}
	
}

class Axis extends Bank{
	void bankMain() {
		System.out.println("Axis Bank");
	}
}

public class Hierarchical {
	
	public static void main(String[] args) {
		
		Sbi s=new Sbi();
		s.bankMain();
		s.bankDetails();
		
		Bob b = new Bob();
		b.bankMain();
		b.bankDetails();
		
		Axis a= new Axis();
		a.bankMain();
		a.bankDetails();
		
	}

}
