package collection_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_3 {

	public static void main(String[] args) {
		
		List<String>fruit=new ArrayList<>();
		fruit.add("Mango");
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Grapes");
		Collections.sort(fruit);
		
		
		System.out.println(fruit);
		
		
		
		List<Integer> ll=new ArrayList<>();
		
		ll.add(15);
		ll.add(7);
		ll.add(57);
		ll.add(34);
		
		Collections.sort(ll);
		
		System.out.println(ll);
		
		
		
	}
	
	
}
