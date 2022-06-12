package CollectionFramework.Queue;

import java.util.*;

public class ArrayDeQueueDemo {
	
	public static void main(String[] args) {
		
		ArrayDeque dq=new ArrayDeque();
		
		dq.offerFirst(2);
		dq.offerLast(1);
		dq.offerFirst(3);
		
		System.out.println(dq);
		
		dq.pollFirst();
		dq.pollLast();
		
		System.out.println(dq);
		
	}

}
