package instance_and_static;

public class Block2 {
	
public static void main(String[] args) {

	Block2 sc=new Block2();

}
	
	
	static {
		
		Block2 sc=new Block2();
			sc.display();
			System.out.println("iam static");
	}
	
	
	{
		
		System.out.println("iam instance method");
	}
	
	
   static	void show()
	{
		System.out.println("welcome");
		
	}
	
	
	void display()
	{
		show();
		
		System.out.println("iam indian");
	}
	
	
	
	
	

}
