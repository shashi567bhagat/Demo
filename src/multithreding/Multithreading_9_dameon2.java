package multithreding;


class daemon_1 extends Thread
{
	@Override
	public void run() {
		
		if(Thread.currentThread().isDaemon())
		{
			
			System.out.println("this is daemon");
		}else
		{
			
			System.out.println("this is user thread");
		}
		
		
	}

}


public class Multithreading_9_dameon2 {

	
	public static void main(String[] args) {
		
		daemon_1 t1=new daemon_1();
		daemon_1 t2=new daemon_1();
		daemon_1 t3=new daemon_1();
		
		
		
		t1.start();
		
		t1.setDaemon(true);
		t2.start();
		t3.start();
		
		
	}
}

