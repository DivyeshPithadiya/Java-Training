package OOP.Encapsulation.AccessModifiers;


class publicAccess {
	
	public String name="Divyesh";
	public String surname="Pithadiya";

	public void display() {
		System.out.println(name);
		System.out.println(surname);
	}
}

public class publicDemo {
	
	public static void main(String[] args) {
		publicAccess a =new publicAccess();
		System.out.println(a.name);
		System.out.println(a.surname);
		
	}
	
	
	
}
