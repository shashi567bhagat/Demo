package multithreding;
//class create by implementing Runnable interface
public class Mutlithreading_2 {

	
	public static void main(String[] args) {
		
		
System.out.println("main " + Thread.currentThread().getName());
		
		System.out.println("main "  +Thread.currentThread().getPriority());
		
		System.out.println("main " +Thread.currentThread().getId());
		
		
		mythread1 mt=new mythread1();
		Thread t=new Thread(mt,"yash");
		t.start();
	}
}


class mythread1  implements Runnable
{

	@Override
	public void run() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//Thread.currentThread().setName(" shashi ");
		
		System.out.println("Runnable " + Thread.currentThread().getName());
		
		System.out.println("Runnable "  +Thread.currentThread().getPriority());
		
		System.out.println("Runnable " +Thread.currentThread().getId());
		
	}
	}