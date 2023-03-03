package collection_3;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashst_2 {

	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		
		lhs.add(4);
		lhs.add(5);
		lhs.add(6);
		
		lhs.add(7);
		lhs.add(8);
		lhs.add(9);
		
		lhs.add(10);
		lhs.add(11);
		lhs.add(12);
		
		Iterator<Integer> i=lhs.iterator();
		while(i.hasNext())
		{
			System.err.println(i.next());
		}
		
		
		
	}
}
