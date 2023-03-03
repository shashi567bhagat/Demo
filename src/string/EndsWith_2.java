package string;

public class EndsWith_2 {

	
	public static void main(String args[])
	{  
		String s1="java by javatpoint";  
		System.out.println(s1.endsWith("t"));  //true
		
		System.out.println(s1.endsWith("T")); //false
		
		System.out.println(s1.endsWith("point"));// true
		
		System.out.println(s1.endsWith("nt")); //true
		
	}
}
