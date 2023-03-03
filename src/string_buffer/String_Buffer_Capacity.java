package string_buffer;

public class String_Buffer_Capacity {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("     ");// white space ke length ko bhi consider karta hai
		
		//System.out.println(sb);
		
		sb.append("                 ");
		
		System.out.println(sb.capacity());
		
		//sb.append("hello");// capacity default capacity se kam hai esliye default value hi show karta hai
		
		//sb.append("Bharat Aluminium Company Limited"); // eska value bydefault value se (16) se jyda hoga to hi (old capacity or 
		
		                                                 // default capacity 16se increase hokr (old capacity *2 +2 hoga
		                                                 // but diya gya string ka char value 34 se kam hoga aur 16 se jyda hoga tabhi uska default value 16*2 +2 wale system me hoga
		                                                 // agar phla hi string 16 se jyda hai 
		
		//sb.append("abcdefghijklmnopqrs");
		//sb.append("Chhattisgarh Power Distribution Company Limited");
		
		//System.out.println(sb.capacity());
		
	
		
	
		
		
	}
	
	
	
}
