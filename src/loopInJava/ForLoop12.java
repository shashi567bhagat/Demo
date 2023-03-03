package loopInJava;

import java.util.Scanner;


/*
 *                Enter Input
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
  *********
  ********
  *******
  ******
  *****
  ****
  ***
  **
  *
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class ForLoop12 {
	
	
	
	
public static void main(String[] args) {
		
	
		   
		   
		   
		   Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Input");
			
		   int row=sc.nextInt();
		   
		   int i;
		   int j;
		   int k;
		   
		   
		   for(i=1;i<=row;i++)
		   {
			   //line se thora dur me likhne ke liye space dene ke liye
			   System.out.print("  ");
			   
			   //space print ( es pattern me space dene ki koi jarurat thi hi nai)
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
			   
			   for(i=1;i<=row-1;i++)
			   {
				   
				   System.out.print("  ");
				   
				   for(j=1;j<=i;j++)
				   {
					   
					  System.out.print(" ");
				   }
				   
				   
				   for(k=row-1;k>=i;k--) 
				   {
					    System.out.print("*"+ " ");
					    
				   }
				   
				   System.out.println();
				   
			   }
		//////////////////////////////////////////////////////////////////////
		 
		   for(i=1;i<=row;i++)
		   {
			   //line se thora dur me likhne ke liye space dene ke liye
			   System.out.print("  ");
			   
			   //space print ( es pattern me space dene ki koi jarurat thi hi nai)
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
		   
		   for(i=1;i<=row-1;i++)
		   {
			   
			   System.out.print("  ");
			   
			   for(j=1;j<=i;j++)
			   {
				   
				  System.out.print(" ");
			   }
			   
			   
			   for(k=row-1;k>=i;k--) 
			   {
				    System.out.print("*"+ " ");
				    
			   }
			   
			   System.out.println();
			   
		   } 
		   
} 
		   
     }   
	 

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		   
	  
	


