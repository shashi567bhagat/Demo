package multithreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class WorkThread implements Runnable
{
	
	
   private	String message;
	

	public WorkThread(String s)
	{
		
		this.message=s;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + "Start Meassage" + message);
		try {
			processmessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "End");
	}
	
	private void processmessage() throws InterruptedException
	{
		Thread.sleep(2000);
	}

}

public class MultiThreding_10_Thread_pool {

	
	public static void main(String[] args) {
		ExecutorService executor= Executors.newFixedThreadPool(5); 
		//executor is also interface class which have only one mehod execute(Runnable command)
		//ExecutorService is a interface class which extends executor interface class ,so tha we can use Execute method of Executor interface class
		for(int i=0;i<10;i++)
		{
			
			Runnable worker= new WorkThread("" + i);
			executor.execute(worker);  //executor is object of ExcecutorService
		}
		
		executor.shutdown();
		
		while(!executor.isTerminated()) {}
		
		System.out.println("finished all threads");
	}
}
