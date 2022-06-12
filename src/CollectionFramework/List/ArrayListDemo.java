package CollectionFramework.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String args[]) {
		
		ArrayList a=new ArrayList();
		ArrayList b=new ArrayList(Arrays.asList("Divyesh","Pithadiya"));
		
		
		a.add(10);
		a.add("Divyesh");
		a.add(1,"Pithadiya");
		
		a.remove(0);
		a.remove("Pithadiya");
	
		a.addAll(b);
		
		System.out.println(a);
		System.out.println("Index of Element Divyesh is: "+a.indexOf("Divyesh"));
		System.out.println("Last index of Element Divyesh is: "+a.lastIndexOf("Divyesh"));
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		for(Object data : a) {
			System.out.println(data);
		}
		
		Iterator it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		a.clear();
		
		System.out.println(a.isEmpty());
		
		System.out.println(a);
		
		
	}
	
}
