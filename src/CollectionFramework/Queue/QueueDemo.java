package CollectionFramework.Queue;

import java.util.*;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue pq=new PriorityQueue<>();
		
		pq.offer(1);
		pq.offer(2);
		pq.offer(3);
		
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
	}

}
