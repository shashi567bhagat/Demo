package operators;


//class 7 video date 8/10/2022


/*Unary postfix Increment/Decrement operator  expr++/expr--
 * 
 * Unary prefix Increment/Decrement operator  ++expr/--expr
 * 
 * +expr/-expr Unary Addition/subtraction Operator
 * 
 * ! unary Not Operator
 * 
 * */

public class UnaryOperator2 {
	
	
	public static void main(String[] args) {
		
		int a=10;
		
		System.out.println(++a); //prefix
		
		//yaha par phle a ka value increase hua matlab 10 se 11 hua
		//so ab a=11 ho chuka hai
		
		int b=--a;//prefix
		
		// yaha par prefix lga hua hai eska matlab ye hai ki phle - hoga to a=10 hoga yahi value b me bhi jayega aur a me bhi
		// to ab a=10
		// b=10 ho jayega
		
		System.out.println(a--);//postfix ab yaha pr postfix lga hua hai to a=9 ho jayega
		
		int c= ++a;//prefix
		// yaha pr prefix lga hua hai to sabse phle incremnet hoga matlab a=9 se 10 ho jayega yahi 
		//value c me bhi jayega
		// matlab ab a=10
		// c=10
		System.out.println(--a); //yaha a= 9 ho jayega
		
		int d=--a;//prefix yaha d=9,a=8 ho jayega
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(-30);
		System.out.println(+30);
		System.out.println(-(-(-(30))));
		
		boolean flag=true;
		System.out.println(!true);
		System.out.println(!!true);
		System.out.println(!!!true);
		
		
		System.out.println(~110);
		System.out.println(~~110);                         //tilde operator 
		int x=-10;  
		System.out.println(~x);
		
		int p=10;
		
		System.out.println(+p);
		
		//10 (11)  postfix
//		
//	
//		
//		System.out.println(++x);//12  prefix
//		System.out.println(x--);//12 (11)  postfix
//		System.out.println(--x);//10  prefix
		}
		
		
		
		
	}


