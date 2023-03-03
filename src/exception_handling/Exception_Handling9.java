package exception_handling;

public class Exception_Handling9 {
   
	public static void main(String[] args) {
		String s="abc";
		
		
		try {
			
			int a=Integer.parseInt(s);
			System.out.println(a);
	        }
		
		catch(ArithmeticException e)
		{
			
		System.out.println(e);
		}
		
		
		
		
		
	
	}
}
