package ExceptionHandling;

public class FinallyDemo {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);
		}
		catch(Exception e) {
//			System.out.println("Exception");
			System.out.println(e);
//			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally block");
		}
		
	}

}
