package multithreding;

public class Multithreading_3 {
	public static void main(String[] args) throws InterruptedException {
	
		mythread2 mt = new mythread2();
		Thread t = new Thread(mt, "yash");
	    t.start();
	    t.join();
		
	
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main method");
			
			Thread.sleep(200);
		}
		
		
	}

}

class mythread2 implements Runnable {

	@Override
	public void run() {

		
		
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println("runnable");
			

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
		}
		


	}
}