package exception_handling;

public class Exception_handling17 {

	public static void main(String[] args) {
			String s = null;

			try {

				

				try {
	                                 try {

						                int x = 10 / 0;
						                
					                      } 
					                   catch (ArithmeticException e) 
					                   {

						              System.out.println("ArithmeticException" + e);
						              
						          

				                      	}
	                                 
	                   int y = s.length();

					  System.out.println("hi");
					  
			     } 
				 
				   catch (ArithmeticException e)

				        {
				 	       System.out.println(e);
				        }

				         catch (NullPointerException e)
				        {
					      System.out.println(e);
				         }

				  System.out.println("welcome");
				
				  
				  
				
				int[] arr = new int[5];
				arr[5] = 10;
				
			
			} 
			
			
			catch (Exception e) {
				System.out.println("Globle exception");
			}

			System.out.println("i love India");

		}
	
		
	}

