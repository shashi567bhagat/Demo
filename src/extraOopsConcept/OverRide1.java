package extraOopsConcept;

//we can't used static keyword in the case of method overriding

class pqr{
	
   public  void print()
	{
		
	}

     public  void print(int a, int b) {
	
	
     }
	
	
}



public class OverRide1 extends  pqr{
	
	

	@Override
	public  void print()
	{
		System.out.println("hello world");
	}
	
	@Override
	public  void print(int a, int b) {
		
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		OverRide1 sc=new OverRide1();
		sc.print();
		sc.print(10, 20);
		
	}

}
