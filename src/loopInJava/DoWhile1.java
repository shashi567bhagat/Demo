package loopInJava;

public class DoWhile1 {
	
	
	public static void main(String[] args) {
//		
//		int i=1;
//		
//		do {
//			
//			System.out.println(i);
//			
//			i++;
//						
//		} 
//		while(true);
		
		
		int i=1;
		int sum=0;
		
		do {
			
			sum=sum+i;
			i++;
			
			
		} while(i<=5);
		
		System.out.println(sum);
	}

}
