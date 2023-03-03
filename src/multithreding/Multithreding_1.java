package multithreding;


//ESME 3 DIFFERENT THREAD RUN HO RHA HAI , JVAM DECIDE WHICH THREAD RUUN 1ST

class mythread extends Thread
{
	
	@Override
	public void run() {
	
		super.run();
		
		System.out.println( Thread.currentThread().getName());
		
		display();
	}

	void display()
	{
		System.out.println( Thread.currentThread().getName());
		
	}
	
}
public class Multithreding_1 {

	
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		mythread mt=new mythread();
		mt.start();
		mt.display();
	    System.out.println(Thread.currentThread().getName());
	}
	
	
}

