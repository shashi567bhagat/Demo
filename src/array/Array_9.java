package array;

import java.util.Scanner;

public class Array_9 {

	public static void main(String[] args) {
		int[][] twodArray = new int[3][2]; // declared and created array object
		
		Scanner s1 = new Scanner(System.in); // created Scanner object
		
		System.out.println("Please enter the values to be added");
		
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 2; j++) {
				twodArray[i][j] = s1.nextInt();
			}
			
			System.out.println();
		}
		
		System.out.println("Your output would be as below:");
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 2; j++) 
			{
				System.out.print(twodArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
