package interfaceJava;



interface abc
{
	
	
	
 public abstract void display();  // void display();  

}

class xyz implements abc
{
     
	@Override
       public void display() {
		
		
		System.out.println("hello world");
	}
	
}


public class InterfaceJava1 {
	
	public static void main(String[] args) {
		
		xyz sc=new xyz();
		sc.display();
	
		
		
		
	}
	
	
	
	

}
