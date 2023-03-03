package instance_and_static;


public class InstanceMethod1 {
	

   static	int a=10;          // instance variable
   

   static	void show()         // we can call instance method into another instance method
	{
		
		System.out.println("welcome");
	}
	
	
   
   

	void display()     // instance method so we can't directly call this method 
	                   // we need to create object of this class
	{
		show();        // we can call instance method into another instance method
		
		System.out.println(a);
		System.out.println("hello shashi");
	}
	
	
	
	public static void main(String[] args) {
		
		
		InstanceMethod1 obj=new InstanceMethod1();
		obj.display();
	
	}

}
