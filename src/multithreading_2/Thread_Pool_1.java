package multithreading_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Pool_1 {

	public static void main(String[] args) {
		
		ExecutorService obj=Executors.newFixedThreadPool(3);
		Runnable r=new abc();
		
		for(int i=0;i<5;i++)
		{
			
			obj.execute(r);
		}
		
		obj.shutdown();
		
	
	}
}


class abc implements Runnable
{

	@Override
	public void run() {
		
		System.out.println("start thread");
	    System.out.println(Thread.currentThread().getName());
		System.out.println("Thread End");
	}
	
  
}