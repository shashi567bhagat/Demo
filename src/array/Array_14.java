package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_14 {

	
	//find 2nd largest no in the given array
	public static void main(String[] args) {
		
		int[]arr= {1,2,3,4,5,6,7,8};
		
		int []arr1= {3,5,18,12,17,25};
		
		Arrays.sort(arr1);
		
		
		
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println( "index of" + i +  "  " +arr1[i] + " ");
			
			
		}
		
		System.out.println("**************");
		
		System.out.println(arr1[arr1.length-2]);
		
	}
	
}
