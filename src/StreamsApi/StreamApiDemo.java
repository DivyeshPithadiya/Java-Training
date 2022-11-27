package StreamsApi;

import java.util.*;
import java.util.stream.*;

public class StreamApiDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(21);
		list.add(5);
		list.add(70);
		
		List<Integer> evenList = list.stream().filter((element)-> element%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		// Methods to create stream
		
		// 1.Arrays as stream
		IntStream s1=Arrays.stream(new int[]{1,2,3,4});
		
		// 2.of method
		Stream s2=Stream.of(list);
		
		// 3.empty method
		Stream s3=Stream.empty();
		
		// 4.builder method
		Stream s4=Stream.builder().build();
		
		// 5.stream() method
		Stream s5=list.stream();
		
		// sorted
		list.stream().sorted().forEach(e->System.out.println(e));
		
		// min or max
		Integer a=list.stream().min((o1,o2)->o1-o2).get();	
		System.out.println(a);
				 
		List<Integer> rollNo  = new ArrayList<>();
		rollNo.add(1);
		rollNo.add(2);
		rollNo.add(3);
		rollNo.add(4);
		rollNo.add(5);
		
	
		List evenNo = 
						rollNo
						.stream()
						.filter((roll)->roll%2==0)
						.collect(Collectors.toList());
				
		List demo = rollNo
						.stream()
						.filter(
								(roll)->roll==3)
						.map(roll->roll+7)
						.collect(Collectors.toList());
				

		List res = rollNo.stream().map( roll -> 
						roll==3 ? roll+7 : roll
						).collect(Collectors.toList());
				
		int sum = rollNo.stream().reduce(1,
				(e1,e2)->e1*e2);
				
		System.out.println(sum);
				
		System.out.println(demo);
				
				
	}

}
