package Question17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example of fail fast iterator
		Map<String, String> empName = new HashMap<String, String>();   
        empName.put("Sam Hanks", "New york");   
        empName.put("Will Smith", "LA");   
        empName.put("Scarlett", "Chicago");   
        Iterator iterator = empName.keySet().iterator();   
        while (iterator.hasNext()) {   
            System.out.println(empName.get(iterator.next()));   
            // adding an element to Map   
            // exception will be thrown on next call   
            // of next() method.   
            empName.put("Istanbul", "Turkey");   
        }  
        
        //Example of fail safe iterator
     // Initializing a ConcurrentHashMap   
        ConcurrentHashMap<String, Integer> m   
            = new ConcurrentHashMap<String, Integer>();   
        m.put("ONE", 1); //Adding values  
        m.put("SEVEN", 7);   
        m.put("FIVE", 5);   
        m.put("EIGHT", 8);   
        // Getting an iterator using map  
        Iterator it = m.keySet().iterator();   
        while (it.hasNext()) {   
            String key = (String)it.next();   
            System.out.println(key + " : " + m.get(key));   
            // This will reflect in iterator.   
            // This means it has not created separate copy of objects  
            m.put("NINE", 9);   
        }   
    }   
	}


