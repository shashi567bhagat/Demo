package collection_1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_list_3 {

	public static void main(String[] args) {
		
		
		ArrayList<String> obj=new ArrayList<>();
		
		
		for(int i=1;i<=10;i++)
		{
			
			obj.add("" +i);
		}
		
		obj.add("shashi");// jis sequence me data fill kr rhe hai usi sequence me data de rha hai
		obj.add("neha");
		obj.add("radha");
		obj.add("sonu");
		
		for(int i=0;i<obj.size();i++)
		{
			
			System.out.println(obj.get(i));
		}
		
		// how to get directly shashi
		
		System.out.println(obj.get(10));
		
		ListIterator<String> lt=obj.listIterator();
	}
	
	
}
