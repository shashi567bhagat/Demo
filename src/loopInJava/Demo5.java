package loopInJava;




class doctor {

	int salary=50000;
	
}

class surgen extends doctor{
	
	int bonus=20000;
}

public class Demo5 extends surgen {
	// TODO Auto-generated method stub
	
	
	public static void main(String[] args) {
		
		Demo5 s=new Demo5();
		System.out.println(s.bonus);
		System.out.println(s.salary);
		}
		
	}