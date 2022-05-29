package RegularExpression;

import java.util.regex.*;
public class EmailValidation {
	
	public static void main(String args[]) {
		
		String email="divyeshpithadiya3@gmail.com";
		
		Pattern p=Pattern.compile("[A-Za-z0-9]{1,}@[A-Za-z]{2,}\\.[A-Za-z]{2,}");
		Matcher m=p.matcher(email);
		
		if(m.matches()) {
			System.out.println("Email is valid");
		}
		else {
			System.out.println("Email is invalid");
		}
		
	}

}
