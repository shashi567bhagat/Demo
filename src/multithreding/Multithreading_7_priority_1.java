package multithreding;

class Priority_1 extends Thread {
	@Override
	public void run() {

		System.out.println("Inside the run() method");
	}

}

public class Multithreading_7_priority_1 {

	public static void main(String[] args) {

		// Creating threads with the help of ThreadPriorityExample class
		Priority_1 th1 = new Priority_1();
		Priority_1 th2 = new Priority_1();
		Priority_1 th3 = new Priority_1();
		th1.setName("shshi");

		System.out.println("thread 1 = " + th1.getName());

		th2.setName("yash");
		
		System.out.println("thread 2 = " + th2.getName());
		
		th3.setName("ayush");
		
		System.out.println("thread 3 = " + th3.getName());

		
		// We did not mention the priority of the thread.
		// Therefore, the priorities of the thread is 5, the default value

		// 1st Thread
		// Displaying the priority of the thread
		// using the getPriority() method
		System.out.println("Priority of the thread th1 is : " + th1.getPriority());

		// 2nd Thread
		// Display the priority of the thread
		System.out.println("Priority of the thread th2 is : " + th2.getPriority());

		// 3rd Thread
		// // Display the priority of the thread
		System.out.println("Priority of the thread th2 is : " + th2.getPriority());

		// Setting priorities of above threads by
		// passing integer arguments
		th1.setPriority(6);
		th2.setPriority(3);
		th3.setPriority(9);

		// 6
		System.out.println("Priority of the thread th1 is : " + th1.getPriority());

		// 3
		System.out.println("Priority of the thread th2 is : " + th2.getPriority());

		// 9
		System.out.println("Priority of the thread th3 is : " + th3.getPriority());
		
		
		
		
		th1.start();
		th2.start();
		th3.start();


		// Main thread

		// Displaying name of the currently executing thread
		System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());

		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

		// Priority of the main thread is 10 now
		Thread.currentThread().setPriority(10);

		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
	}

}
