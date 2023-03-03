package collection_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Synchronized_arraylist_obj2 {

	
	public static void main(String[] args) {
		
		
		List<String> ll= Collections.synchronizedList(new ArrayList<> ());
		
		ll.add("shashi");
		ll.add("neha");
		ll.add("school");
		
		
		synchronized (ll) {
			Iterator<String> itr=ll.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		
		
		
	}
	
	
}
