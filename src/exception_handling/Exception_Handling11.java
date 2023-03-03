package exception_handling;

public class Exception_Handling11 {

	
	public static void main(String[] args) {
		
		try {
			
			System.out.println(5/0);
		}
		catch(Exception e)
		{
			
			System.out.println("don't divided by zero");
		}
	}
}
