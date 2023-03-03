package collection_4_Map;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QUE_3 {

	
	public static void main(String[] args) {
		
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Amit");
		pq.add("Vijay");
		pq.add("Karan");
		pq.add("Jai");
		pq.add("Rahul");
		
		System.out.println(pq.peek());
		System.out.println(pq.element());
		
		Iterator<String> i=pq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		pq.remove();
		pq.poll();
		
		System.out.println("After Removing the Elements");
		
		System.out.println(pq);
		
	}
	
}
