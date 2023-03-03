package interfaceJava;

  



/*  multiple inheritance is not supported in the case of class because of ambiguity. However,
 *  it is supported in case of an interface because there is no ambiguity.
 *  It is because its implementation is provided by the implementation class. For example:
 * 
 * 
 * 
 * 
 * 
 * 
 * */
interface Vehicle
{
  void speed();	
}

interface car
{
void speed();	
}


public class Interfaceclass9 implements Vehicle, car{

	@Override
	public void speed() {
		System.out.println("speed of car is about 90Kmph");
		
	}

	
	public static void main(String[] args) {
		Interfaceclass9 sc=new Interfaceclass9();
		sc.speed();
	}
}
		
	
	
	
