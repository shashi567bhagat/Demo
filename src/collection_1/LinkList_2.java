package collection_1;

import java.util.LinkedList;


public class LinkList_2 {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<>();
		
	
		ll.add("java");
		ll.add("is");
		ll.add("program");
		ll.add(2, "best");
		System.out.println(ll);
		
		//System.out.println(ll.get(2));
		System.out.println(ll.indexOf("program"));
		System.out.println(ll.size());
		
		
		ll.remove("is");
		System.out.println(ll);
		
		
		
		
		
		
		
	}
	
}
