package CollectionFramework.List;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String args[]) {
		
		Stack<Integer> a=new Stack<>();
		a.push(2);
		a.push(4);
		a.push(5);
		
		System.out.println(a);
		
		a.pop();
		
		System.out.println(a);
		System.out.println(a.peek());
		
	}

}
