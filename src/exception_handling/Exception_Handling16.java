package exception_handling;

public class Exception_Handling16 {

public static void main(String[] args) {
	String s=null;
	
	try {
		
		int [] arr=new int[5];
		arr[5]=10;
		
		     try {
		    	 
		    	 int y=s.length();
		    	 
		    	        try {
		    		 
		    		          int x=10/0;
		    	            }
		    	         catch(ArithmeticException e)
		    	         {
		    		 
		    		      System.out.println("ArithmeticException" +e);
		    		      
		    	         }
		    	        
		    	        System.out.println("hi");
		    	        
		    	        
		    	 } catch(ArithmeticException e)
		     
		           {
		    		 System.out.println(e);
		           }
		     
		     
		       catch(NullPointerException e)
		        {
		    	   System.out.println(e);
		        }
		     
		       System.out.println("welcome");
		     
	} 
	     catch(Exception e)
	     {
		  System.out.println("Globle exception");
	     }
	
           System.out.println("i love India");
	
       }
   }
