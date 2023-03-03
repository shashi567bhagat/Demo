package loopInJava;

import java.util.Scanner;


//      class 11

/*   Enter Input
     10
     Enter Input
10
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********   
    111111111*
    11111111**
    1111111***
    111111****
    11111*****
    1111******
    111*******
    11********
    1*********
    **********
 * 
 * 
 * 
 * 
 * */

public class ForLoop11 {

	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Input");
		
	   int row=sc.nextInt();
	   
	   int i;
	   int j;
	   int k;
	   
	   for(i=1;i<=row;i++)
	   {
		   
		   //System.out.print("   ");
		   
		   for(j=row;j>i;j--)
		   {
			   
			  System.out.print(" ");
		   }
		   
		   
		   for(k=1;k<=i;k++) 
		   {
			    System.out.print("*"+" ");
			    
		   }
		   
		   System.out.println();
		   
	   }   
		   
	   
	}
	
	
	
	
}
