package programs;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rev=0;
		
		while(n!=0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		
		
		System.out.println("Reverse of a number is: "+rev);
		
		
	}

}
