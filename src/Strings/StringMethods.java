package Strings;

public class StringMethods {
	
	public static void main(String args[]) {
		
		String name="Divyesh Pithadiya";
		String a="DIVYESH";
		String b="divyesh";
		
		System.out.println(name.charAt(4));
		System.out.println(name.substring(0,4));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.length());
		System.out.println(name.replace('y','v'));
		System.out.println(name.concat(" Pithadiya"));
		System.out.println(name.contains("Z"));
		System.out.println(name.indexOf('D'));
		System.out.println(name.indexOf("Divyesh"));
		System.out.println(name.lastIndexOf('i'));
		System.out.println(a.compareToIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(name.endsWith("Pithadiya"));
		System.out.println(name.startsWith("Divyesh"));
		
		
	}

}
