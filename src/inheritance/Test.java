package inheritance;
//  single inheritance

//Base class

   class A{
	  
	  String name = "John";
	  int age =17;
	  String city = "Delhi";
	  
	  public void show()
	  {
	    System.out.println(name+ " " + age + " "+ city);
	  }
	  
	  public static void display()
	  {
		  
		 System.out.println("iam shashikant bhagat"); 
		  
	  }
	  
	  A()
	  {
		  
		  System.out.println(" iam the constractor");
	  }
	  
	  static {
		  
		  System.out.println("hiiiiii iam static keyword");
	  }
	  
	  
	  {
		  
		  System.out.println("iam normal block");
	  }
	  
	}
	

     class B extends A {
	//child class
    //defining additional properties to child class
		  int marks = 78;
		  
    }


     public class Test {
	
    public static void main(String[] args) {
     B obj=new B();
	
	System.out.println(obj.marks);  
	   
	  obj.show();
	  
	  obj.display();
}
}
