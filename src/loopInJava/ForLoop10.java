package loopInJava;



/*      print this pattern
 *         **********
  *********
   ********
    *******
     ******
      *****
       ****
        ***
         **
          *

      1*****
      11****
      111***
      1111**
      11111* 
 * 
 * 
 * */

import java.util.*;
public class ForLoop10 {

	
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter input");
	int row=sc.nextInt();
		
	int i;
	int j;
	int k;
	
	
	for(i=1; i<=row; i++) {
		
		for(j=0;j<i;j++)
		{
			System.out.print(" ");
		}
		
		for(k=row;k>i-1;k--)
		{
			System.out.print("*" + "");
		}
			
		System.out.println();
		
		
	}
		
		
	}
}
