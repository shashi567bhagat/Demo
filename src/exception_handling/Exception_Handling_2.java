package exception_handling;

public class Exception_Handling_2 {

	
	
	public static void main(String[] args) {
		
		int data;
		try {
			
			System.out.println( data=100/0);
			
			System.out.println("hello JVM");
			
		}catch(ArithmeticException e)
		{
			
			
			System.out.println(e);
		}
		
          
		finally
		{
			System.out.println("iam final");
		}
		
		
		System.out.println("helo");
		
	}
}
