package exception_handling;

public class Exception_Handling3 {

	public static void main(String[] args) {
		
		
		int data=100/0; // ESME line no 9 ke baad kuch bhi execute nahi hoga
		try {
			
			System.out.println( data=100/0);
			
			System.out.println("hello JVM");
			
		}
		
	 catch(Exception e)
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
	
	

