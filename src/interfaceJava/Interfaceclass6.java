package interfaceJava;


//multiple inheritance

   interface Printable {
	void print();
   }

   interface Showable {
	void show();
   }



public class Interfaceclass6 implements Printable ,Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		 Interfaceclass6 obj = new Interfaceclass6();
		obj.print();
		obj.show();
}
}