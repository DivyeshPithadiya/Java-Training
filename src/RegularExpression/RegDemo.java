package RegularExpression;

import java.util.regex.*;

public class RegDemo {
	
	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("[a-z0-9]{1,}@[a-z]{2,}\\.[a-z]{2,}");
		Matcher m=p.matcher("vikaskpatel11@gmail.com");
		
		if(m.matches()) {
			System.out.println("Valid email");
		}
		else {
			System.out.println("Invalid email");
		}
		
		
	}

}
