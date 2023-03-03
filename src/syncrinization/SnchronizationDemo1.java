package syncrinization;

class Tabledemo {
	synchronized  void printTable(int n) {// method not synchronized
		 
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		
	  }
	}
}

class MyThread_1 extends Thread {
	Tabledemo t;

	MyThread_1(Tabledemo t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread3 extends Thread {
	Tabledemo t;

	MyThread3(Tabledemo t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class SnchronizationDemo1 {
	public static void main(String args[]) {
		Tabledemo obj = new Tabledemo();// only one object
		MyThread_1 t1 = new MyThread_1(obj);
		MyThread3 t2 = new MyThread3(obj);
		t1.start();
		t2.start();
	}
}
