package OOP.Encapsulation.AccessModifiers;

class PrivateAccess {
	
	private String name="Divyesh";
	
	private String surname="Pithadiya";
	
	private int id=1220;
	
	void display() {
		System.out.println(name);
		System.out.println(surname);
		System.out.println(id);
	}
	
}


public class PrivateDemo {
	
	public static void main(String[] args) {
		
		PrivateAccess a =new PrivateAccess();
//		System.out.println(a.name); // This will give an error because name is private and can not be used outside the class
		a.display();
		
	
	}


}
