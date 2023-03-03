package string;

public class String_Method_start {

	
	
	
	public static void main(String[] args) {
	  	
		
		String s1="abcdefghijklmnop";
		
		
		String s2="abc";
		
		
		System.out.println(s1.charAt(2));
		
		
		System.out.println(s1.length());
		
		
		System.out.println(s2.length());
		
		
	    for ( int i=0;i<=s1.length()-1;i++)// even number 
	    	
		{
	    	
			System.out.print(s1.charAt(i));
			
			i++;
		}
	}
	
	
}
