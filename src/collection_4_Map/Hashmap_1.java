package collection_4_Map;

import java.util.HashMap;

public class Hashmap_1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, null);
		hm.put(2, null);
		hm.put(3, null);
		hm.put(4, null);
		// agar key value different ho but sabhi value null ho fir bhi size consider karta hai
		// hum 1 hi null key value de sakte hai.
		hm.put(null, "shashi");
		hm.put(null, "radhika");
		
		hm.put(null, "rahul");
		hm.put(null, "ravi");
		
		System.out.println(hm.size());
		
		
		
	}
	
	
}
