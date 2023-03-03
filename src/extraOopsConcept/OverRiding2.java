package extraOopsConcept;



class Parent 
{
       public static  void show(int a,int b) 
       {
	     int sum=a+b;
	     System.out.println(sum);
	     
	     System.out.println("iam parent");
	   }
}


class Child extends Parent
{
       
	   public static void show(int a,int b) 
       {
	     int sum=a+b;
	     System.out.println(sum);
	     System.out.println("iam child");
	   }
}



public class OverRiding2 {

	
	
	public static void main(String[] args) {
		
		 {
			 Parent obj =new Child();
			 obj.show(10, 20);
			  
		 }
	}
	
}

