package collection_4_Map;

import java.util.HashMap;

public class Hashmap_containskey {

	public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();
        
        map.put("INDIA", 120);
        map.put("USA", 30);
        map.put("CHINA", 150);
        
        
        //search map.containkey() use krte hai
        if(map.containsKey("CHINA"))
        {
        	System.out.println("Present in the map");
        }else
        {
        	System.out.println("not Present");
        }
        
		//agar mujhe key mil gya hai to uske relavent value kya hoag
        //get function se pta kr skte hai
        
        System.out.println(map.get("CHINA"));
        
        
	}
}
