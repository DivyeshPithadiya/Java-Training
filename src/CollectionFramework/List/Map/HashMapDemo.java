package CollectionFramework.List.Map;

import java.util.*;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
//		Map map=new HashMap<>();
		 Map<String,String> map=new HashMap<>();
		
		map.put("id","1234");
		map.put("name","Divyesh");
		map.put("surname","Pithadiya");
		
		System.out.println(map);
		
		System.out.println(map.get("name"));
		
		map.remove(5);
		System.out.println(map);
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
