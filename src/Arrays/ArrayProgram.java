package Arrays;

import java.util.Scanner;

class ArrayProgram {
	
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		
		int[] arr= new int[6];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			sum=sum+arr[i];
		}
		
		System.out.println("Sum is: "+sum);
		
	}
	
}