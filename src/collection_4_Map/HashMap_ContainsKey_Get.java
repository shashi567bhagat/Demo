package collection_4_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_ContainsKey_Get {

	
	public static void main(String[] args) {
		
         HashMap<String,Integer> map=new HashMap<>();
         
         map.put("INDIA", 120);
         map.put("USA", 30);
         map.put("CHINA", 150);
         map.put("", null);//interview que size ko consider krta hai
         map.put("", 10);
         map.put(null, null);
         map.put(null, 11);
         
         System.out.println(map.size());
         System.out.println(map);
         
         Set s1=map.entrySet();
         Iterator s2=s1.iterator();
         //or
         
         Set<Entry<String, Integer>> s=map.entrySet();
         Iterator i=s.iterator();
         while(i.hasNext())
         {
        	 System.out.println(i.next());
         }
//         or
//         for(Map.Entry<String, Integer> obj:map.entrySet())
//         {
//        	
//        	System.out.println(obj.getKey()+ " " +obj.getValue()); 
//        	
//         }
		
		
	}
}
