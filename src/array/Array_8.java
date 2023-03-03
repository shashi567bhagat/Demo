package array;

public class Array_8 {

	public static void main(String[] args) {
		int[][] twoDimentional = {{1,1},{2,2},{3,3},{4,4}};
		
		
		System.out.println("before update");
		for(int i = 0 ; i <twoDimentional.length ; i++)
		{
			
		  for(int j = 0 ; j <2; j++)
		  {
		   System.out.print(twoDimentional[i][j] + " ");
		  }                                                    
		System.out.println();
		
		}
		
	
		twoDimentional[2][0]=5;
		twoDimentional[2][1]=9;
	
		
		System.out.println("after update");
		
		for(int i=0;i<twoDimentional.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(twoDimentional[i][j] + " ");
			}
			
			System.out.println();
			
		}
			
	}
	
	
	
}
