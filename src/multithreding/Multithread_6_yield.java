package multithreding;


class yield_1 extends Thread
{
	
	@Override
	public void run() {
		
		for(int i=0;i<=5;i++)
		{try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			System.out.println("Yield method 1");
			//Thread.yield();
		}
		
		
	}
	
	
}

class yield_2 extends Thread
{
	
	@Override
	public void run() {
		
		for(int i=0;i<=5;i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Yield method 2");
			
		}
		
		
	}
	
	
}



public class Multithread_6_yield {
	
public static void main(String[] args) throws InterruptedException {
	
	yield_1 y=new yield_1();
	yield_2 y1=new yield_2();
	y.start();
	y.join();
	y1.start();;
	
	
	for(int i=0;i<=5;i++)
	{
		
		Thread.sleep(200);
		System.out.println("main method");
	}
	
}
}
