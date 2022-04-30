package keywords.staticKeyword;

class Teacher {
	
	Teacher() {
		System.out.println("Teaching");
	}
	
	static {  // Static block
		System.out.println("Static block");
	}
	
}

public class staticBlock {
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
	}
	
}
