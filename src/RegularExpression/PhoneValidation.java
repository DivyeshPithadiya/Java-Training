package RegularExpression;

import java.util.Scanner;
import java.util.regex.*;

public class PhoneValidation {

	public static void main(String args[]) {
		
		System.out.println("Enter phone number: ");
		
		Scanner in=new Scanner(System.in);
		String phone=in.nextLine();
		
		Pattern p= Pattern.compile("[\\+][9][1][6789][0-9]{9}||0[6789][0-9]{9}");
		Matcher m=p.matcher(phone);
		
		if(m.matches()) {
			System.out.println("Valid Phone number");
		}
		else {
			System.out.println("Invalid Phone number");
		}
		
	}
}
