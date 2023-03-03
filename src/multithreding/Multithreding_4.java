package multithreding;


class multi extends Thread
{
	
@Override
public void run() {
		for(int i=0; i<5;i++)
	{
		
	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		System.out.println("Iam Indian");
	}
}

}

public class Multithreding_4 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		multi multi=new multi();
		
		//multi obj=new multi();
		multi.start();
		multi.join();//importance of Join ,jiske thread ke object ke saath lgta hai uske thread ko sabse phle execute krta hai usk baad bacche hus 
		// thread lo execute karta hai
		//obj.start();
		
		
	for(int i=0;i<=5;i++)
	{
		Thread.sleep(200);
		System.out.println("main Method");
	}
		
	}

}


