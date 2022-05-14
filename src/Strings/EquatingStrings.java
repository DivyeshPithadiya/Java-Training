package Strings;

public class EquatingStrings {
	
	public static void main(String args[]) {
		
		String a="Sanjay";
		String b="Sanjay";
		
		System.out.println(a==b);
		
		String c=new String("Divyesh");
		String d=new String("Divyesh");
		
		System.out.println(c==d);
		
		boolean res=c.equals(d);
		System.out.println(res);
		
		System.out.println(c.compareTo(d));
		
	}
	
}
