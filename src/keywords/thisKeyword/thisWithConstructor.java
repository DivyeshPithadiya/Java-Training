package keywords.thisKeyword;


class Bank {
	public Bank() {
		System.out.println("Default constructor of Bank");
	}
	
	public Bank(String name) {
		this();
		System.out.println("Bank name: "+name);
	}
	
	public Bank(int employee, String name) {
		this(name);
		System.out.println("Number of employees are: "+employee);
	}
	
}


public class thisWithConstructor {
	
	public static void main(String[] args) {
		Bank b=new Bank(20,"Axis");
	}
	
	
}
