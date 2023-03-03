package loopInJava;

public class ContinueStatement3Label {
	
	
	
public static void main(String[] args) {
		
		
		int i;
		int j;
		
		
	A1:	for(i=1;i<=5;i++)
		{
			
			for(j=1;j<=5;j++)
			{
				
				if(i==3 && j==4)
				{
					
					continue A1;
					
				}
				
				System.out.println(i +"-------->"+ j);
				
			}
			
		
	
	
		}
		}
	

}
