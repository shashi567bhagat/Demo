package string;

public class Equal_Operator {

	
	
	public static void main(String[] args) {
		
		String s="shashi";
		
		String s1="shashi";
		
		String s2= new String("shashi");
		
		String s3=new String("shAshi");
		
		System.out.println( s==s1);// this operator check the address
		
		System.out.println( s==s2);
		
		System.out.println( (s==s3));
		
		System.out.println(s.equals(s1));// this method check the contains only not the address
		
		System.out.println(s.equals(s2));
		
	    System.out.println("------------------------------------------------");	
	    
	    System.out.println("Case-sensitive  " + s.equals(s3));
	
	    System.out.println("Case-sensitive  " + s.equalsIgnoreCase(s3));
	    
		System.out.println("------------------------------------------------");
		
		System.out.println("Address of s -----> " +System.identityHashCode(s));
		System.out.println("Address of s1 ----> " +System.identityHashCode(s1));
		System.out.println("Address of s2 ----> " +System.identityHashCode(s2));
		System.out.println("Address of s3 ----> " +System.identityHashCode(s3));
		
	}
}
