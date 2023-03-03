package syncrinization;
// in the synchronization if we want to use two different obj for thread than this keyword cantbe used
//if we want to use this keyword with synchronized than class obj should be same for thread
//if we use diffrent obj for thread than on the block level we  must use synchonized(class_name.class)
// if both obj of table55 class is different ,at the method level we must use "static" keyword with synchronization



class Table55 {
	static synchronized void printTable(int n) {// method not synchronized

	
			for (int i = 1; i <= 5; i++)

			{
				System.out.println(n * i);
				
			}

		}

	}

	class MyThread20 extends Thread {

		Table55 t;

		public MyThread20(Table55 t) {
			this.t = t;
		}

		public void run() {

			Table55.printTable(10);
		}

	}

	class MyThread21 extends Thread {

		Table55 t;

		public MyThread21(Table55 t) {
			this.t = t;
		}

		public void run() {

			Table55.printTable(200);
		}
	}

    public class Synchronized_4 {

   public static void main(String[] args) {
	Table55 obj=new Table55();
	Table55 obj1=new Table55();
	
	MyThread20 th1=new MyThread20(obj);
	MyThread21 th2=new MyThread21(obj1);
	
	th1.start();
	th2.start();
	
	//System.out.println("hii");
	
	
      }
 }

