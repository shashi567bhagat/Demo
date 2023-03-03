package array;

public class Array_12 {

 static	int []a= {1,2,3,4,5,6,7,8,9,10};
 
 static	int []b= {100,200,300};	
 
	public static void main(String[] args) {
		
		printshow(a);
		printshow();
	}
	
	static void printshow(int [] a)
	{
		
		for(int obj:a)  //for each loop
		{
			System.out.print(obj + " ");
		}
		System.out.println();
	}

	static void printshow()
	{
		
		for(int obj:b)  //for each loop
		{
			System.out.print(obj + " ");
		}
		
	}
	
	
	
}
