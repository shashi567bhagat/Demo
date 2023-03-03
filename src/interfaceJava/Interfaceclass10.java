package interfaceJava;

//Java 8 Default Method in Interface

interface Drawable5 {
	void draw();

	default public void msg() {
		System.out.println("default method");
	}
}

class Rectangle implements Drawable5 
{

	@Override
	public void draw() {
		System.out.println("drawing rectangular");
		
	}

	@Override
	 public void msg() {
		
		Drawable5.super.msg();
	}

	}
	
   public class Interfaceclass10 {

	public static void main(String args[]){  
		Rectangle d=new Rectangle();  
		d.draw();  
		d.msg();
	}
}
