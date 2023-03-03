package collection_4_Map;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Map_Entry_1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		
		map.put(100,"Arvind");
		map.put(101, "Gopal");
		map.put(102, "Sagrika");
		
		for(Map.Entry m:map.entrySet()){  
			
			
			System.out.println(m.getKey()+" "+m.getValue());  
		}
	
	}
}