package OOP;


class Addition {
	
	void add(int a,int b) {
		int c=a+b;
		System.out.println("Sum is: "+c);
	}
	
}

public class WithParameterMethod {
	
	public static void main(String[] args) {
		Addition obj= new Addition();
		obj.add(10, 20);
		obj.add(10, 30);
		obj.add(40, 30);
		obj.add(10, 70);
		obj.add(50, 80);
		obj.add(70, 30);
		obj.add(20, 20);
		obj.add(30, 30);
		obj.add(50, 50);
		obj.add(70, 50);
		
	}
	
}
