package interfaceJava;

//Java 8 Static Method in Interface

interface Drawable7 {
	public void draw();

	static int cube(int x) {
		return x * x * x;
	}
}


interface klm extends Drawable7
{

//    static void draw()// hum static word ka use child class me kabhi bhi nai kr sakte
//	{
//   	System.out.println("hola");
//	}
	
	
	
     default void draw()// hum static word ka use child class me kabhi bhi nai kr sakte but same method jo parent me ho 
                        // baki child me static method kisi dusre method ke saath likh sakte hai
     
     
	{
    	System.out.println("hola");
	}
	
     static void xyz()
     {
	 System.out.println("hii shashi");
     }

}



public class Interfaceclass12 implements klm {
	public static void main(String args[]) {
		Drawable7 d = new Interfaceclass12();
		d.draw();
		System.out.println(Drawable7.cube(3));
		klm.xyz();
		
		
	}
}
