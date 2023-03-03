package exception_handling2;

public class Try_nasted {

	public static void main(String args[]){   
		 //outer try block   
		  try{    
		  //inner try block 1  
		             try
		           {    
		                
		              int b =39/0;    
		           }  
		             
		           //catch block of inner try block 1  
		               catch(ArrayIndexOutOfBoundsException e)  //ArithmeticException e
		              {  
		               System.out.println(e);  
		              }    
		       
		             //catch block of inner try block 2  
		             catch( ArithmeticException e)  //ArrayIndexOutOfBoundsException e
		          
		             {  
		        	   
		              System.out.println("MAI HANDLE KARUNGA" +e);  
		           
		             }    
		  
		            //inner try block 2  
		          try {  
		        	  
		            int a[]=new int[5];    
		  
		           //assigning the value out of array bounds  
		            a[5]=4; 
		            
		              }  
		  
		             //catch block of inner try block 2  
		             catch( ArithmeticException e)  //ArrayIndexOutOfBoundsException e
		          
		             {  
		        	   
		              System.out.println("MAI HANDLE KARUNGA" +e);  
		           
		             }    
		          //catch block of inner try block 2  
		             catch(ArrayIndexOutOfBoundsException e)  //ArrayIndexOutOfBoundsException e
		          
		             {  
		        	   
		              System.out.println("MAI HANDLE KARUNGA" +e);  
		           
		             }    
		  
		          catch( Exception e)  //ArrayIndexOutOfBoundsException e
		          
		             {  
		        	   
		              System.out.println("MAI HANDLE KARUNGA" +e);  
		           
		             }    
		          
		      
		     
		  }  
		  //catch block of outer try block  
		  catch(Exception e)  
		  {  
		    System.out.println("handled the exception (outer catch)");  
		  }  
		  
		    
		  System.out.println("normal flow..");  
		  
		  
	 }
}
