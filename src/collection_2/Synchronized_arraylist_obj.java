package collection_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Synchronized_arraylist_obj {

	public static void main(String[] args) {

		// creating a thread-safe Arraylist.
		CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>();

		synchronized (threadSafeList) {
			threadSafeList.add("geek");
			threadSafeList.add("code");
			threadSafeList.add("practice");
			
			
			
			Iterator<String>it=threadSafeList.iterator();
			
		    while (it.hasNext())
		    {
			System.out.println(it.next());
			}
				
	}
  }
}

