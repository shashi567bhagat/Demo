package extraOopsConcept;

abstract class ATM{
	 
	 
	int x;
     public abstract  int Withdraw();
	
	public abstract int topup();
	
	public abstract void BalanceCheking();
	
	void display()
	{
		
		System.out.println("hello world");
		
	}

	public ATM(int x) {
		//super();
		//this.x = x;
		System.out.println(x);
	}
	
	
}


public class AbstractClass extends ATM {

	
	
	
	
	public AbstractClass(int x, int topup, int withdraw) {
		
		super(x);
		this.topup = topup;
		this.Withdraw = withdraw;
	}
	
	int topup;
	int Withdraw;
	
	
	

	@Override
	public int Withdraw() {
		
		
		return Withdraw ;
	}

	@Override
	public int topup() {
		
		return topup;
	}

	@Override
	public void BalanceCheking() {
		
		int NetBalance=topup-Withdraw;
		
		System.out.println(NetBalance);
		
		
	}	
		public static void main(String[] args)
		{
			AbstractClass sc=new  AbstractClass(10,5000,2000);
			
			sc.BalanceCheking();
			sc.display();
			System.out.println(sc.Withdraw);
			
		}
	}


