package syncrinization;


class Tabledemo1 {
	synchronized  void printTable(int n) {// method not synchronized
		 show();	
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	  
	}
	
	public void show()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("hii");
		}
		
		
		
	}
	
}

class MyThread_11 extends Thread {
	Tabledemo1 t;

	MyThread_11(Tabledemo1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread31 extends Thread {
	Tabledemo1 t;

	MyThread31(Tabledemo1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}


public class Sdjjkbk {

	
	
		public static void main(String args[]) {
			Tabledemo1 obj = new Tabledemo1();// only one object
			Tabledemo1 obj1=new Tabledemo1();
			
			MyThread_11 t1 = new MyThread_11(obj);
			MyThread31 t2 = new MyThread31(obj1);
			t1.start();
			t2.start();
		}
	}

