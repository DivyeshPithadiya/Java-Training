package keywords.finalKeyword;




// final class A { // This code will give an error because final class can not be inherited
//	
// }

class A {
	
}

class B extends A{
	
}

public class finalClass {
	
	public static void main(String[] args) {
		B b=new B();
	}
	
}
