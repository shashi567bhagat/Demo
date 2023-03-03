package array;

public class Array_class6 {

	// Multidimensional Arrays:

	public static void main(String[] args)
	{
		// Syntax
		int[][] arr = new int[3][3];

		arr[0][0] = 12;
		arr[0][1] = 10;
		arr[0][2] = 15;
		arr[1][0] = 19;
		arr[1][1] = 24;
		arr[1][2] = 25;
		arr[2][0] = 23;
		arr[2][1] = 156;

		for (int i = 0; i < arr.length; i++) 
		
		{
			
			for (int j = 0; j < arr.length; j++)
				
			{
				System.out.print(arr[i][j] + "   ");
			}

			
			System.out.println();
		
		}
		// 3 row and 3 column
	}

}
