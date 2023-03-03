package interfaceJava;



//multiple inheritance

interface parent12 {
	void print();
}

interface mother12 {
	void print1();
}

interface abc2 extends parent12,mother12 
{

	@Override
	default void print() {
		System.out.println("hello world");
		
	}

	@Override
	default void print1() {
	System.out.println("welcom shashi");
		
	}

	
	 
	 
	 
}

public class Interfaceclass8  implements abc2{
	public static void main(String args[]) {
		 Interfaceclass8 obj = new Interfaceclass8();
		 obj.print();
		 obj.print1();
		
		
		
}
}
