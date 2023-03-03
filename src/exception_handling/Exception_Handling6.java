package exception_handling;

public class Exception_Handling6 {

	
	public static void main(String[] args) {
		
		
		String str=null;
		try {
		System.out.println(str.charAt(0));
		}catch(ArithmeticException e)
		{
			
			System.out.println(e);
		}
		
		System.out.println("welcome");
		
	}
}
