package syncrinization;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
	
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}
}

public class ProducerConsumerdemo {
	public static void main(String args[]) {
		 Customer c = new Customer();
		Mythreaddemo obj=new Mythreaddemo(c);
		Mythreaddemo1 obj1=new Mythreaddemo1(c);
		obj.start();
		obj1.start();
		
	
	}
}


class Mythreaddemo extends Thread
{  Customer c;

	public Mythreaddemo(Customer c)
	{
		this.c=c;
	}
	
	@Override
	public void run() {
		c.withdraw(5000);
	}
	
}




class Mythreaddemo1 extends Thread
{  Customer c;

	public Mythreaddemo1(Customer c)
	{
		this.c=c;
		
		
	}
	
	@Override
	public void run() {
		c.deposit(10000);
	}
	
}




