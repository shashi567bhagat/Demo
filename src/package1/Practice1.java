package package1;


abstract class abc
{
	
	int x;
	public abstract int withdraw();
	
	public abstract int  topup();
	
	public abstract int netbalance();
	
	
	public abc(int x)
	{
		
		this.x=x;
		
		System.out.println(x);
	}
	
	
	
}


public class Practice1  extends abc{

	int topup;
	int  withdraw;
	
public	Practice1 (int x,int topup,int withdraw)
{
	super(x);
	this.topup =topup;
	this.withdraw=withdraw;
	

}
	@Override
	public int withdraw() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int topup() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int netbalance() {
		int netbalance=topup-withdraw;
	System.out.println(netbalance);
	return 0;
	}
	
	
	public static void main(String[] args) {
		Practice1 obj=new Practice1(10,5000,2000);
		obj.netbalance();
		}

}
