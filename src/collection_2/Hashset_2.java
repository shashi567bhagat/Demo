package collection_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Hashset_2 {

	
	public static void main(String[] args) {
		
	HashSet<String> hs=new HashSet<>();
	hs.add("one");
	
	hs.add("two");
	
	hs.add("three");
	
	hs.add("four");
	
	hs.add("five");
	
	Iterator<String> i= hs.iterator();
	
	while(i.hasNext())
	{
		
		System.out.print(i.next()+ "  ");
	}
		
	}
}
