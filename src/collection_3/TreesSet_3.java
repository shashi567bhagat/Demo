package collection_3;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesSet_3 {

	public static void main(String[] args) {
		
		TreeSet<Integer> tt = new TreeSet<>();

		tt.add(3);
		tt.add(5);
		tt.add(2);
		tt.add(15);
		tt.add(17);
		tt.add(10);
		tt.add(18);
		tt.add(23);
		
		System.out.println(tt);
		
		System.out.println(tt.subSet(5, 23));
		
		//It returns the equal or closest least element of the specified element from the set,
		//or null there is no such element.
		
		System.out.println("floor " +tt.floor(14));
		
		System.out.println("floor " +tt.floor(16));
		
		System.out.println("floor " +tt.floor(15));
		
		System.out.println("Ceiling " + tt.ceiling(18));
		
		System.out.println("Ceiling " +tt.ceiling(20));
		
		Iterator<Integer> ii=tt.descendingIterator();
		
		while(ii.hasNext())
		{
			System.out.print(ii.next() + "  ");
		}
		
	}
	
}
