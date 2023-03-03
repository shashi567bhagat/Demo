package syncrinization;

 class Sychronizationdemo
 {
 void show(int a) throws InterruptedException //with synchronized with three thread
	 {
		synchronized(Sychronizationdemo.class) {
		 for(int i=1;i<=5;i++)
		 {
			 System.out.println(a*i);
			 Thread.sleep(500);
		 }
		 
	
	 }
	 
	 }
 }

 class thread_1 extends Thread
 {
	 @Override
	public void run() {
		 Sychronizationdemo obj=new Sychronizationdemo();
		 try {
			obj.show(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
 }
 
 class thread_2 extends Thread
 {
	 @Override
	public void run() {
		 Sychronizationdemo obj1=new Sychronizationdemo();
		 try {
			obj1.show(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
 }
 
 
 class thread_3 extends Thread
 {
	 @Override
	public void run() {
		 Sychronizationdemo obj2=new Sychronizationdemo();
		 try {
			obj2.show(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
 }
 
 
 
 
public class Sycronized_3 {
	
public static void main(String[] args) {
	
	thread_1 th1=new thread_1();
	
	thread_2 th2=new thread_2();

	thread_3 th3=new thread_3();
	
	th1.start();
	th2.start();
	th3.start();
}
}
