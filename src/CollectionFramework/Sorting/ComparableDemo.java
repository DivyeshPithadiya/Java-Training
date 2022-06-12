package CollectionFramework.Sorting;

import java.util.*;

public class ComparableDemo {

	public static void main(String args[]) {
		
		ArrayList<Employee> list=new ArrayList<>();
		
		list.add(new Employee(3,"Divyesh","Pithadiya"));
		list.add(new Employee(1,"Mihir","Parmar"));
		list.add(new Employee(2, "Deep", "Patil"));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}
	
}
