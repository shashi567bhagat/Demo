package exception_handling2;



class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        // Call constructor of parent Exception
    	
    
    super(s);
    		 
    	
       
    }
}

public class THOW_EXCEPTION {

	
	
	void display(String s) throws InvalidProductException
	{
		
		if( s=="BMW")
		{
			throw new  InvalidProductException("Product Invalid");
		}else
		{
			System.out.println(" Vehicle is valid ");
		}
		
	}
	
	void numeric(int a,int b) throws ArithmeticException
	{
		
		int c= (a/b);
		if(c>=10)
		{
		System.out.println("valid number");
		
		}else
		{

			throw new ArithmeticException ("Arithmetic Exception Occure");
		}
		// JVM doesnot arrive in throw statement after get error on line no 39
		
	}
	
	
      void productCheck(int weight)
      {
    	  try {  
    			if(weight>=100)
    			{
    				throw new InvalidProductException("Product Invalid");
    			}
    			else 
    			{
    				 System.out.println("product valid");
    			}
    			
    	      }
    	  
    	  catch(InvalidProductException e)
    	    {
		     System.out.println(e);
		    }
    	  
    	  catch(ArithmeticException e)
  	    {
		     System.out.println("product valid");
		    }
    	  
      }
	   
	    public static void main(String args[]) throws InvalidProductException,InvalidProductException,ArithmeticException
	    {
	    	THOW_EXCEPTION obj = new THOW_EXCEPTION();
	        obj.productCheck(45);
	        
	        try {
	        	   obj.display("tata");	
	        	   
	        	   
	        }
	     catch(InvalidProductException e)
	        {
	    	 
	    	 System.out.println(e);
	        }
	        
	      try {
	    	  
	    	  obj.numeric(10, 0);	
	      }
	        	catch(ArithmeticException e)
	      
	      {
	        		System.out.println(e);
	      }
	        	
	       
	        }
	       
	    }
	


