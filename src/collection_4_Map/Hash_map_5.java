package collection_4_Map;

import java.util.HashMap;

public class Hash_map_5 {
	
public static void main(String[] args) {
	
	
	
HashMap<Character, Integer> hp=new HashMap<>();
	
	String s="aaaabbbccd";
	
	for(int i=0;i<s.length();i++)
	{
		if(hp.containsKey(s.charAt(i)))
		{
			int value=hp.get(s.charAt(i));
			
			//System.out.println(value);
			hp.put(s.charAt(i), ++value);
			
		}
		else
	    {
			hp.put(s.charAt(i), 1);
			
		}
		
		
	}
	
	System.out.println(hp);
	System.out.println("********");
	System.out.println(s.charAt(0));
	System.out.println(hp.get('a'));//a =character hai
	System.out.println(hp.get('b'));


}
	
}
