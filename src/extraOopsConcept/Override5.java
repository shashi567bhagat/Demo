package extraOopsConcept;

public class Override5  {
	
	
	 void add()

	{
		System.out.println("hii");
		
		
	}
	
	
	void display()
	{
		Override5 sc=new Override5();
		sc.add();
		System.out.println("world");
		
	}
	public static void main(String[] args) {
		Override5 sc=new Override5();
		sc.display();
		//sc.add();
		
	}

}
