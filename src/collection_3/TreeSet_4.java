package collection_3;

import java.util.TreeSet;

public class TreeSet_4 {

	
	
	
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
		
		System.out.println(tt.higher(15));
		
		System.out.println(tt.lower(18));
		
		System.out.println("pollFirst " + tt.pollFirst());
		
		System.out.println(tt);
		
		System.out.println("pollLast " +tt.pollLast());
		
		System.out.println(tt);
		
		
	}
}
