package interfaceJava;




//multiple inheritance

 interface Printable1 {
	void print();
 }

 interface Showable1 {
	void show();
 }

 interface abc1 extends Printable,Showable 
 {

	@Override
	default void show() {
		System.out.println("hello");
		
	}

	@Override
	default void print() {
		System.out.println("welcome");
		
	}
	 
	 
	 
 }

public class Interfaceclass7 implements abc1
{
	public static void main(String args[]) {
		 Interfaceclass7 obj = new Interfaceclass7();
		obj.print();
		obj.show();
}
}