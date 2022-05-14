package Strings;

public class StringBufferDemo {
	
	public static void main(String args[]) {		
		
		StringBuffer s=new StringBuffer("Divyesh");
		

		s.append(" Pithadiya");
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		
		System.out.println(s.charAt(0));
		
		s.replace(0, 7,"Divyesh");
		System.out.println(s);
		
		s.delete(0, 9);
		System.out.println(s);
	}

}
