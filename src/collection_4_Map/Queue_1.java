package collection_4_Map;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_1 {

	
	public static void main(String[] args) {
		
		Queue<String> pq=new PriorityQueue<>();
		pq.add("shashi");
		pq.add("radha");
		pq.add("sachine");
		pq.add("dhoni");
		pq.add("baby");
		pq.add("Elephant");
		pq.add("apple");
		pq.add("aeroplane");
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  

		Iterator<String> s=pq.iterator();
		while (s.hasNext()) {
		
			System.out.println(s.next());
		}
		
		System.out.println("**********************");
		System.out.println("head--> " +pq.element());
		System.out.println("head--> " +pq.peek());
		
		System.out.println(pq.poll());
		
		//System.out.println(pq.element());
		
		
		
	}
	
	
	
}
