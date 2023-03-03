package array;

import java.util.Scanner;

public class Array_10 {

	
public static void main(String[] args) {

	int[][]ab=new int[3][4];//i=row,j=column
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter add the value");
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<4;j++)
		{
			ab[i][j]=sc.nextInt();
			
		}
		
		System.out.println();
	}
	
	

System.out.println("Your output would be as below:");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<4;j++)
		{
			System.out.print(ab[i][j] + "  ");
			
		}
		
		System.out.println();
	}
	
	
	
	
	
	
	
}
	
	
}
