package loopInJava;


/*        
 * The continue statement is used to skip the current iteration of the loop.
 * 
 *                the value of i---->1
                  the value of i---->2
                  the value of i---->3
                  the value of i---->4
                  the value of i---->5
                  the value of i---->7
                  the value of i---->8
                  the value of i---->9
                  the value of i---->10
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class ContinueStatement1 {

	
	public static void main(String[] args) {
		
		int i;
		
		
		for(i=1;i<=10;i++)
		{
			if(i==6) {
				
				
				continue;
			}
			
			System.out.println("the value of i"+"---->"+i);
			
			
			
		}
		
		
		
	}
	
	
}
