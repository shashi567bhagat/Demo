package collection_3;

import java.util.TreeSet;

public class TreeSet_2 {

	
	public static void main(String[] args) {
		
		TreeSet<Integer> tt=new TreeSet<>();
		

		tt.add(3);
		tt.add(5);
		tt.add(2);
		tt.add(15);
		tt.add(17);
		tt.add(10);
		tt.add(18);
		tt.add(23);
		
		/*It returns the equal or closest greatest element of the specified element from the set, 
		 *or null there is no such element.
	     */
		System.out.println(tt);
		
		System.out.println(tt.ceiling(25));//
		
		System.out.println(tt.ceiling(14));
		
        //SortedSet headSet(E toElement)-
		//It returns the group of elements that are less than the specified element.

	
		
		System.out.println("HeadSet " +tt.headSet(13));
		
		System.out.println("HeadSet " +tt.headSet(15));
		
		System.out.println("HeadSet " +tt.headSet(15, true));
		
		System.out.println("Tailset " +tt.tailSet(15));
		
		System.out.println("Tailset " +tt.tailSet(15, false));
		
		
	}
}
