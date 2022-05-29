package RegularExpression;

import java.util.Scanner;
import java.util.regex.*;

public class RegexDemo {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		Pattern p =Pattern.compile("[A-Za-z]?");
		System.out.println("Enter data: ");
		Matcher m=p.matcher(s.nextLine());

		System.out.println(m.matches());
	
	}
}
