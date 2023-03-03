package interfaceJava;

//Java 8 Default Method in Interface




interface Drawable6 {
	void draw();

	default  void msg() {
		System.out.println("default method");
		
		System.out.println("iam indian");
	}
}


interface circle extends Drawable6 
{

	@Override
    default void draw() 
	{
		System.out.println("drawing rectangular");
		
	}

	@Override
	default void msg() 
	{
		Drawable6.super.msg();
	}

	
}



interface service extends circle
{

	@Override
	default void draw() {
		
		circle.super.draw();
	}

	@Override
	default void msg() {
		
		circle.super.msg();
	}
}
interface bus extends service
{

	@Override
	default void draw() {
		
		service.super.draw();
	}

	@Override
	default void msg() {
		System.out.println("hoo");
		service.super.msg();
	}
	


}
public class Interfaceclass11 implements bus {
	public static void main(String args[]){  
		Interfaceclass11 d=new Interfaceclass11();  
		d.draw();  
		d.msg();
	}
}
