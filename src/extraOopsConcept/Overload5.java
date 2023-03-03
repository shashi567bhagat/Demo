package extraOopsConcept;

//overload of static method

 class Test {
    public static void display() {
        System.out.println("Hello");
    }
    public void display(int a,int b) {
        System.out.println(a+b);
    }
    
    
    
}

public class Overload5 {

	public static void main(String args[])
    {
    	Test.display();
        Test test = new Test();
		test.display(10,12);
    }
   
	
	
}
