package collection_1;

import java.util.ArrayList;

public class Array_list_1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> obj=new ArrayList<>();
		
		
		for(int i=1;i<=10;i++)
		{
			
		obj.add("" +i);	;
		}
		
		obj.add("shashi");// jis sequence me data fill kr rhe hai usi sequence me data de rha hai
		obj.add("neha");
		obj.add("radha");
		obj.add("sonu");
		
//		for(int i=0;i<obj.size();i++)
//		{
//			
//			System.out.println(obj.get(i));
//		}
		//or
		System.out.println("**********");
		
		for(String ss:obj)
		{
			System.out.println(ss);
		}
		// how to get directly shashi
		
		System.out.println(obj.get(10));
		
		
		System.out.println(obj.lastIndexOf("ee"));;;;;;;;;;;;;;;;;;;;;;
		
		System.out.println(obj.contains("radha"));// true ,false me ans deta hai (boolena expression dta hai)
		
		
		System.out.println(obj.isEmpty()); //ye check karta hai ki obj me chize bhara hua hai ya khali hai
		
		obj.clear();
		
		System.out.println(obj.isEmpty());
		
		System.out.println(obj);
		
		
	}
	
	
}
