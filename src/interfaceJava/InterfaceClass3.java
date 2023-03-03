package interfaceJava;

 interface Drawable 
 {
	void draw();

	
	default void defaultMethod()
	{
		System.out.println("this is a default method in the interface");
	}
	

	static void staticMethod() 
	{
		System.out.println("this is a static method in the interface");
	}
}

    class Main implements Drawable {

		@Override
		public void draw() {
			
			System.out.println("hii");
		}	
}
  public class InterfaceClass3 {
    	 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub  
				Drawable m = new Main();
				Drawable.staticMethod();
				m.defaultMethod();
				m.draw();
}
}
