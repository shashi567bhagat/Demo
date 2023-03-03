package collection_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_1 {

	
	public static void main(String[] args) {
		
		List<String> ll=new ArrayList<>();
		
		ll.add("Raghu");
		ll.add("vivek");
		ll.add("Ram");
		ll.add("Shyam");
		ll.add("Rajveer");
		
		ListIterator<String> lt= ll.listIterator();		
		
		System.out.println("traversing the list in the forward direction.");
		
	while(lt.hasNext())
	{
		System.out.println("index  " + lt.nextIndex() + " values " + lt.next());
	}
	
	 System.out.println("Traversing elements in backward direction");    
	 
	while(lt.hasPrevious())
	{
		
		System.out.println("index " + lt.previousIndex() + " valuse " + lt.previous());
	}
	
	
	}
	
}
