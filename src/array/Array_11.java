package array;

public class Array_11 {

	static String[][] twoDimentional = {{"1","1","1","1"},{"2","2","2","2"},{"3","3","3","3"},{"4","4","4","4"}};
	
	
	public static void main (String[] args)
	{
	  System.out.println("Before updating an array: ");
	
	  printArray();
	
	  twoDimentional[3][0] = "B";
	  twoDimentional[3][1] = "A";
	  twoDimentional[3][2]=  "7";
	
	  System.out.println("After updating an array element: ");
	
	  printArray();
	
	}
	
	static void printArray()
	{
		
	for(int i=0; i<twoDimentional.length; i++)
	{
	   for(int j=0; j<twoDimentional.length; j++)
		{
	     System.out.print(twoDimentional[i][j]);
	    }
	
	System.out.println("");
	
	}
	
  }
}
