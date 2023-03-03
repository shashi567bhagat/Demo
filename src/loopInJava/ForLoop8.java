package loopInJava;

import java.util.Scanner;

public class ForLoop8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No");

		int row = sc.nextInt();

		int i;
		int j;
		int k;

		for (i = 1; i <= row-1; i++) {

			for (j=row-1; j > i; j--)
			{
				
				System.out.print(" ");
			
			}
			  
			  for(k=0; k<i; k++)
				  
			  { System.out.print("*"); 
			  
			  }
			  
			  System.out.println();
			  
			 

		}

	}

}
