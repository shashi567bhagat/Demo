package multithreding;


class mythread_1 implements Runnable
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
			
			System.out.println("Thread 1");
		}
		
		System.out.println(Thread.currentThread().getName());
	}
	
}

class mythread_2 implements Runnable
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
			System.out.println("Thread 2");
		}
		System.out.println(Thread.currentThread().getName());
		
	}
	
}


public class Multithread_5 {

	public static void main(String[] args) throws InterruptedException {
		mythread_1 myth1=new mythread_1();
		Thread t=new Thread(myth1);
		t.start();
		t.yield();
		//t.join();
		
		mythread_2 myth2=new mythread_2();
		Thread t2=new Thread(myth2);
		t2.start();
		
		for(int i=0;i<=5;i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main method");
		}
		
		
		System.out.println(Thread.currentThread().getName());
	}
}
