package exception_handling;

public class Exception_Handling8 {

	
	public static void main(String[] args) {
		
		
		String str="Shashikant Bhagat";
		
		try {
			
			System.out.println(str.charAt(0));
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally {
			
			System.out.println("finally executed");
		}
		
		
		System.out.println("welcome");
	}
}
