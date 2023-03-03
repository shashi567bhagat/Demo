package extraOopsConcept;

class MethodoverLoading{
	
	
	public static int display(int a, int  b)
	{
		System.out.println(a+b);
		return a+b ;
		
	}
	
	public static double display(int a, double b)
	{
		System.out.println(a+b);
		return a+b;
		
	
	}
	
}



public class MethodOverloadingStaticKey {
	
	public static void main(String[] args) {
		//MethodoverLoading sc=new MethodoverLoading();
		MethodoverLoading.display(10, 12.45);
		MethodoverLoading.display(10, 25);
		
		
	}

}
