package collection_3;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset_1 {

	//the elements iterate in insertion order.
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		
		lhs.add("one");
		lhs.add("two");
		lhs.add("three");
		lhs.add("four");
		lhs.add("five");
		
		Iterator<String> i=lhs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
