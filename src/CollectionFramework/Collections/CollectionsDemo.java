package CollectionFramework.Collections;

import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(-5);
		list.add(-2);
		list.add(5);
		list.add(2);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		System.out.println(Collections.frequency(list,1));
		
		System.out.println(list);
		
	}
	
}
