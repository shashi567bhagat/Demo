package array;

import java.util.Arrays;

public class ARRAY_15 {

	
		public static void main(String[] args)
		{
		// Fetching Array
		int Arr[] = { 10, 30, 35, 52, 75 };
		
		int [] arr1= { 3,6,2,25,16,44,56,22  }; // after sort{2,3,6,16,22,25,44,56}
		
		Arrays.sort(arr1);
		
//		System.out.println(Arrays.binarySearch(arr1,44 ));
//		
//		System.out.println(Arrays.binarySearch(arr1, 16));
//		
//		System.out.println(Arrays.binarySearch(arr1, 56));
//		
		String[] str= {"shashi","neha","radha","priyanshu","ashish","shashi","radha"};
		
		Arrays.sort(str);
		
		System.out.println(Arrays.toString(str));
		
		//System.out.println(Arrays.binarySearch(str, "neha"));
		
		System.out.println(Arrays.binarySearch(str, "radha"));
       // System.out.println(Arrays.binarySearch(str, "neha"));
		
		//System.out.println(Arrays.binarySearch(str, "radha"));
		
		
		
	for(int i=0;i<str.length;i++)
	{
		
		System.out.println("Index of " + i + " = " + str[i] );
		
	}
	
		
		//System.out.println(  str1 + " is found at index =" + Arrays.);
		
		
		
//		Arrays.sort(Arr);
//		
//		
//		System.out.println(Arrays.binarySearch(Arr, 75));
//		
//		System.out.println(Arrays.binarySearch(Arr, 30));
//		
		int a = 52;
		
		//System.out.println (a  + " is found at index = "+ Arrays.binarySearch(Arr, a));
	}
	
	
}
