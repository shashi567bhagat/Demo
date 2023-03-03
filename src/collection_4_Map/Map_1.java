package collection_4_Map;

import java.util.HashMap;
import java.util.Map;

public class Map_1 {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hm=new HashMap<>();
		
		hm.put(1, "abc");
		
		hm.put(2, "bcd");
		
		hm.put(null, null);
		
		hm.put(null, "pqr");
		
		hm.put(null, "xyz");
		
		System.out.println(hm.get(2));
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		for(Map.Entry<Integer, String> obj:hm.entrySet()){
       
			System.out.println(obj.getKey() + "  " +obj.getValue());
       }
		
		
		
	}
	
	
	
	
	
	
}
