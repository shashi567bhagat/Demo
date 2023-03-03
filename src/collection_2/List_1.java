package collection_2;

import java.util.ArrayList;
import java.util.List;

//Let's see a simple example of List where we are using the ArrayList class as the implementation.


public class List_1 {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		
		l.add("shashi");
		l.add("neha");
		l.add("priya");
		
		for(String name:l)
		{
			System.out.println(name);
			
		}
		
		
		
	}
	
	
}
