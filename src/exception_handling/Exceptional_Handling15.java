package exception_handling;

public class Exceptional_Handling15 {

	
	// compile time error
	public static void main(String args[]){    
		   try
		   {    
		    int a[]=new int[5];    
		    a[5]=30/0;    
		   }    
		  
		  
		   
		   catch(ArithmeticException e)
		   {  System.out.println("task1 is completed");
		   
		   }     
		   catch(ArrayIndexOutOfBoundsException e)
		   {  
			   System.out.println("task 2 completed");
		   }
		     
		   
           catch(Exception e)                    // parent ko subclass ke phle rkh dene se aisa hota hai
		   
		   {  System.out.println("common task completed");
		   
		   } 
             
		   System.out.println("rest of the code..."); 
	}
	
}
