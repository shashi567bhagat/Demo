package loopInJava;

public class BreakLoop3Label {

	
public static void main(String[] args) {
		
		int i;
		int j;
		
	first:	for(i=1;i<=5;i++) {
			
			for(j=1;j<=5;j++) 
			
			{
				
			if(i==2 && j==4) {
				
				
				break first;
			}	
				
			System.out.println(i +"-------->"+ j);	
				
			}
	
	}
	
}
}
