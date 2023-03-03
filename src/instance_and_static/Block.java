package instance_and_static;

public class Block {

	
		int empId;
	String empName;
	
	public static void main(String[] args) {
		System.out.println("iam main method");
		
		Block sc=new Block(12, "shashi");
		
	}
	
	
	
	
	public Block(int empId, String empName) {
		
		display();
		show();
		
		this.empId = empId;
		this.empName = empName;
		
		System.out.println(empId +"  "+ empName);

		
	
	
}


	static {
		//Block sc=new Block(12, "shashi");
		//sc.	show();
		System.out.println("iam static");
	}
	
	
	{
		
		display();
		 show();
		System.out.println("iam instance method");
		
	}
	
	
	void show()
	{
		System.out.println("welcome");
		
	}
	static void display()
	{
		
		
		System.out.println("iam indian");
	}
	
	

}


