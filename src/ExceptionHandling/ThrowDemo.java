package ExceptionHandling;


class AgeException extends RuntimeException {
	
	AgeException(String msg) {
		super(msg);
	}
}

public class ThrowDemo {

	public static void main(String[] args) {
		int age=17;
		
		if(age>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			
			try {
				throw new AgeException("Not eligible to vote");
			}
			catch(AgeException e) {
				System.out.println(e.getMessage());
			}	
			
			System.out.println("Hello");
			
		}
		
	}
	
}
