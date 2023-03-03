package collection_4_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.print.DocFlavor.STRING;

public class Hashmap_3 {

	
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new  HashMap<>();
		hm.put(1, "Mango");
		hm.put(2, "Apple");
		hm.put(3, "Banana");
		hm.put(1, "Grapes");
		
		for(Map.Entry<Integer, String> obj:hm.entrySet())
		{
			System.out.println(obj.getKey()+" " +obj.getValue()+ " ");
		}
		
	}
}
