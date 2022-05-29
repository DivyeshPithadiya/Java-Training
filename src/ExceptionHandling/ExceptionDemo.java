package ExceptionHandling;

public class ExceptionDemo {

	public static void main(String args[]) {
		
		int a=10;
		int b=0;
		String name=null;
		
		try {
			System.out.println(a/b); // Risky code
			name.toLowerCase();
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmenicException occured");
		}
		catch(NullPointerException e1) {
			System.out.println("NullPointerException occured");
		}
		System.out.println("Exception");
		
	}
}
