package collection_4_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap_2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		
		for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		
		
		
	}
}
