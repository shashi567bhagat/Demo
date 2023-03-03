package exception_handling;

public class Exception_Handling4 {

	static int data;
	
	public static void main(String[] args) {
		try {
			int data=100/0;
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try {
			
			System.out.println( data=100/0);
			
			System.out.println("hello JVM");
			
		}
		
	 catch(Exception e)
		{
		 
		        System.out.println(10/0);
				System.out.println("error");
		}
		
		finally
		{
			System.out.println("iam final");
		}
		
		
		System.out.println("helo");
		
		
		
	}
}
