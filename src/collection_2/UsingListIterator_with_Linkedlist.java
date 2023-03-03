package collection_2;

import java.util.LinkedList;
import java.util.ListIterator;

public class UsingListIterator_with_Linkedlist {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("BALCO");
		list.add("TATA");
		list.add("TCS");
		list.add("INFOSYS");
		list.add("WIPRO");

		ListIterator<String> lt = list.listIterator();

		
		System.out.println(" Forward");
		while (lt.hasNext()) {
       	System.out.println(" forward index  " + lt.nextIndex() + " value  " + lt.next());
		}
		
		System.out.println(" previous");
		
		while(lt.hasPrevious()) {
			System.out.println(" previous index  " + lt.previousIndex() + " valuse  " + lt.previous());
		}
		
//			String s = (String) lt.next();
//
//			if (s.equals("BALCO"))
//
//				lt.remove();
//			
//			if (s.equals("TATA"))
//				
//				lt.add("TATA SALT");


		//System.out.println(list);
	}

}
