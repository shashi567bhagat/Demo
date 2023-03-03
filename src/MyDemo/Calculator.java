package MyDemo;

import java.util.Scanner;



  public class Calculator {
	  
 
  static int password=2245;
		                     // if we assign password outside of the main method then 
             //   we have to assign password with static keyword otherwise it show error
     
     
	
	public static void main(String[] args) {
		
		int password=2245;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the pincode");
		
        int pincode = sc.nextInt();
        

        if(pincode == password) {
	
	     System.out.println("Trancation succeed");
         }
        
         else 
		{
		System.out.println("Invalid Password");
	    }
	
        
	}
	
}
