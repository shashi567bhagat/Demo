package exception_handling;

public class Exception_Handling1 {

	public static void main(String[] args) {

		System.out.println("1");

		System.out.println("2");

		System.out.println("3");
		try {

			System.out.println(10 / 0);
			
		} 
		catch (Exception ex)

		{
		
			System.out.println(ex);
		}
		finally
		{
			
			
			System.out.println("Finally Executed");
			
		}

		System.out.println("5");

		System.out.println("6");

		System.out.println("7");

	}

}
