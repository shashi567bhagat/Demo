package multithreading_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool2 {
	public static void main(String[] args) {
		
		ExecutorService obj=Executors.newSingleThreadExecutor();
		Runnable r=new abcd();
		
		for(int i=0;i<5;i++)
		{
			
			obj.execute(r);
		}
		
		obj.shutdown();
	}
}
class abcd implements Runnable
{

	@Override
	public void run() {
		
		System.out.println("start thread");
	    System.out.println(Thread.currentThread().getName());
		System.out.println("Thread End");
	}
	
  
}