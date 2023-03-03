package collection_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_2 {

	
	public static void main(String[] args) {
		
		
		//creating Array
		
		String[] array= {"java","c#","HTML","CSS"};
		
		System.out.println(Arrays.toString(array));
		
		// converting array into the list
		
		
		List<String> ll=new ArrayList<String>();
		
		for(String list: array)
		{
			//System.out.println(list);
			ll.add(list);
		}
		
		System.out.println(ll);
		
	}
	
	
}
