package ExceptionHandling;

public class NestedException {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(12/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic");
			try {
				String s=null;
				s.toLowerCase();
			}
			catch(NullPointerException e1) {
				System.out.println("NullPointer");
			}
			
		}
		
	}

}
