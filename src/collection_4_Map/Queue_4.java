package collection_4_Map;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Book implements Comparable<Book>
{

	int id;
	String Name;
	String Author;
	String Publisher;
	int Quantity;
	
	public Book(int id,String Name,String Author,String Publisher,int Quantity)
	{
		this.id=id;
		this.Name=Name;
		this.Author=Author;
		this.Publisher=Publisher;
		this.Quantity=Quantity;
		
		
	}
	
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", Name=" + Name + ", Author=" + Author + ", Publisher=" + Publisher + ", Quantity="
				+ Quantity + "]";
	}



	@Override
	public int compareTo(Book that) {
		
		if(this.id>that.id)
			return 1;
		if(this.id<that.id)
			return -1;
		else
			return 0;
	
		
	}
	

}

public class Queue_4 {

	
	public static void main(String[] args) {
		
		
		PriorityQueue<Book> queue=new PriorityQueue<Book>();
	
		
		Book b1=new Book(121,"shashi","shashi","gate",10);
		
		Book b2=new Book(233,"Operating System","Galvin","Wiley",6);
		
		Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		
		
	  //  queue.add(new Book(121, "Analog Electronics","shishir","Gate Academy", 50));
		
		queue.add(b1);
		queue.add(b2);
		queue.add(b3);
		
		//Collections.sort(queue);//ye Queue me kaam nahi karta hai linklist me kaam krta hai accha se
		
		for(Book b:queue)
		{
			System.out.println(b.id+ " " + b.Name+ " "+ b.Author + b.Publisher +  " " + b.Quantity);
			
			
			
		}
	    
	    
		 
		
		
		
		
		
		
		
		
	
		
		
		
	}
}
