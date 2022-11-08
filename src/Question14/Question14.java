package Question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =
		           Collections.synchronizedList(new ArrayList<String>());
		 
		        list.add("practice");
		        list.add("code");
		        list.add("quiz");
		 
		        synchronized(list)
		        {
		            // must be in synchronized block
		            Iterator it = list.iterator();
		 
		            while (it.hasNext())
		                System.out.println(it.next());
		        }
		        
		        
		        // creating a thread-safe Arraylist.
		        CopyOnWriteArrayList<String> threadSafeList
		            = new CopyOnWriteArrayList<String>();
		 
		        // Adding elements to synchronized ArrayList
		        threadSafeList.add("geek");
		        threadSafeList.add("code");
		        threadSafeList.add("practice");
		 
		        System.out.println("Elements of synchronized ArrayList :");
		 
		        // Iterating on the synchronized ArrayList using iterator.
		        Iterator<String> it = threadSafeList.iterator();
		 
		        while (it.hasNext())
		            System.out.println(it.next());
		    }
	}


