package loopInJava;

public class ContinueStatement2 {

	public static void main(String[] args) {
		
		
		int i;
		int j;
		
		
		for(i=1;i<=5;i++)
		{
			
			for(j=1;j<=5;j++)
			{
				
				if(i==3 && j==4)
				{
					
					continue;
					
				}
				
				System.out.println(i +"-------->"+ j);
				
			}
			
		
				
			
			
			
			
		}
		
		
	}
	
	
	
	
}
