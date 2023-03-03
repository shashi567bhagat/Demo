package collection_4_Map;

import java.util.HashMap;
import java.util.Map;
 class Hashmap_4 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hash=new HashMap<>();
		
		hash.put(100, "Mango");
		hash.put(101, "Banana");
		
		for(Map.Entry m:hash.entrySet())
		{
			System.out.println(m.getKey()+ " "+m.getValue()+ " "  );
		}
		
		
		hash.putIfAbsent(102, "Grapes");
		System.out.println("*************");
		for(Map.Entry m:hash.entrySet())
		{
			System.out.println(m.getKey()+ " "+m.getValue()+ " "  );
		}
		
		
		HashMap<Integer, String> hash1=new HashMap<>();
		
		hash1.put(103,"Orange");
		hash.putAll(hash1);
		
		System.out.println("***************");
		for(Map.Entry m:hash.entrySet())
		{
			System.out.println(m.getKey()+ " "+m.getValue()+ " "  );
		}
		
		
		
		
		
		
		
	}
	
	
}
