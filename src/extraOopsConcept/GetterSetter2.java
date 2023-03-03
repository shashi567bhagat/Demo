package extraOopsConcept;

import java.util.Scanner;

class abc{
	
	int num;
	
	//Method 1 Getter
	
	public int getNumber()
    {
    	return num;
    }
	
	// Method 2 - Setter
    public void setNumber(int number)
    {
 
        // Checking if number is between 1 to 10 exclusive
        if (number < 1 || number > 10) {
 
            throw new IllegalArgumentException();
        }
         num = number;
    }

    
} 
   
     public class GetterSetter2 {
	

      public static void main(String[] args) {
    	  
    	 abc obj =new abc() ;
    	 obj.setNumber(12);
    	 System.out.println(obj.getNumber());
	    
	    
      }
   }
