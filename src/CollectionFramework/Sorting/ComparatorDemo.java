package CollectionFramework.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class idComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getId()-o2.getId();
	}
}

class nameComparator implements Comparator<Student> {
	
	@Override
	public int compare(Student o1, Student o2) {
		return o2.getName().compareTo(o1.getName());
	}
}

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<>();
		
		list.add(new Student(2,"Divyesh"));
		list.add(new Student(1,"Bhavya"));
		list.add(new Student(3,"Janvi"));
		
		System.out.println(list);
		
		Collections.sort(list,new idComparator());
		
		System.out.println("Sorted using id: "+list);
		
		Collections.sort(list,new nameComparator());
		
		System.out.println("Sorted using name: "+list);
	}

}
