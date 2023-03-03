package inheritance;



class animal{
	
	void eat()
	{	
		System.out.println("Eating......");	
	}
}

class dog extends animal{
	
	void bark()
	{
		System.out.println("Braking......");
	}
	
	
}

class babddog extends animal{
	
	void weep()
	{
		System.out.println("weeping.....");
	}
}


 public class Test2 {
 public static void main(String[] args) {
	babddog sc=new babddog();
	sc.eat();
	sc.weep();
	
	
	dog obj=new dog();
	obj.eat();
	obj.bark();
	
	
}
}
