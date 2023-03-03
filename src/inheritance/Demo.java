package inheritance;
// single inheritance


class parent{
	
	 static void show()
	
	{
	 System.out.println("iam parent");	
	}
	
}

class child extends parent{
	
	void display()
	{
		//parent sc=new parent();
		parent.show();// super keyword ka alterntive
		
		System.out.println("iam child");
		
	}
		
}


public class Demo {
	
	public static void main(String[] args) {
		
		child sc =new child();
		sc.show();
		sc.display();
		
	}

}
