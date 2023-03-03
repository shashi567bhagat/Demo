package collection_2;

import java.util.HashSet;

public class Hashset_1 {
//dublicate elements ingore krta hai
	
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("shashi");
		hs.add("school");//set ke condition me koi bhi deta repeat nahi hota
		hs.add("school");
		hs.add("shashi");
		hs.add("shashi");
		hs.add("apple");
		hs.add("ant");
		hs.add(null);
		
		
	System.out.println(hs);
		
	}
}
