package string;

public class String_Method_class {

	static	String name;
	static String ss="";
	public static void main(String[] args) {
		
		String s1="      Hello  welcome    ";
		
		String s2="WELCOMEandnTRAIN";
		
		String s3="";
		
		String s4="ELEPHANT";
		
		String s5="application";
		
	
		
		//System.out.println(name.length()); //exception throw krega
		
		System.out.println(ss.length());
		
		for(int i=0;i<s5.length();i++)//////uppercase -lower case ka combination
		{
			if(i%2==0) {
				
				System.out.print(s5.toUpperCase().charAt(i));
				
			}
			else 
			{
				System.out.print(s5.toLowerCase().charAt(i));
			}
			
			
		
		}
		
		for(int i=0;i<s5.length();i++)//////uppercase -lower case ka combination
		{
			if(i%2!=0) {
				
				System.out.print(s5.toUpperCase().charAt(i));
				
			}
			else 
			{
				System.out.print(s5.toLowerCase().charAt(i));
			}
			
			
		
		}
		
		
		//ye bhi ek tarika hai
		for(int i=0;i<s5.length();i++)//////uppercase -lower case ka combination
		{
			if(i%2!=0) {
				
				
				String result= ""+ s5.charAt(i);
				result=result.toUpperCase();
			
				System.out.print(result);
				//System.out.print(s5.toUpperCase().charAt(i));
				
			}
			else 
			{
				System.out.print(s5.toLowerCase().charAt(i));
			}
		}	
		
//		
//		System.out.println("--------------------");
//		
//		System.out.println(s5.toUpperCase());
//		
//		System.out.println(s4.toLowerCase());
//		
//		System.out.println(s1.concat(s2));
//		
//	
//		
//		System.out.println(s3.isEmpty());
//		
//		System.out.println(s1);
//		System.out.println("---------------------");
//		
//		System.out.println(s1.length());
//		
//		System.out.println(s1.trim());
//		
//		System.out.println(s2.toLowerCase());
//		
		
		
		
		
		
	}

}
	
	
	

