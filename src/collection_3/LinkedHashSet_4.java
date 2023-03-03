package collection_3;

import java.util.LinkedHashSet;

public class LinkedHashSet_4 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		

		lhs.add("Ravi");
		lhs.add("shyam");
		
		lhs.add("Rose");
		
		lhs.add("Flower");
		
		
		System.out.println("Display all the elements");
		
		System.out.println(lhs);
		
		lhs.remove("Flower");
		
		
		System.out.println("After removing Elements");
		
		System.out.println(lhs);
	}
	
	
}
