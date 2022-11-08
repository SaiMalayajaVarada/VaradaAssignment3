package Question20;
/* Thread 1 */  
class Thread1 extends Thread   
{  
      
    public void run()   
    {  
        System.out.println("Thread 1");  
        System.out.println("i in Thread 1 ");  
        for (int i = 1; i <= 5; i++)   
        {  
            System.out.println("i = " + i);  
            try   
            {  
                Thread.sleep(1000);  
            }   
            catch (InterruptedException e)   
            {  
                e.printStackTrace();  
            }  
        }  
        System.out.println("Thread 1 Completed.");  
    }  
}  
  
/* Thread 2 */  
class Thread2 extends Thread   
{  
    public void run()   
    {  
        System.out.println("Thread 2");  
        System.out.println("i in Thread 2 ");  
        for (int i = 1; i <= 5; i++)  
        {  
            System.out.println("i = " + i);  
        }  
        System.out.println("Thread 2 Completed.");  
    }  
}  
  
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// life cycle of Thread  
	    // Thread's New State  
	    Thread1 t1 = new Thread1();  
	    Thread2 t2 = new Thread2();  
	    // Both the above threads are in runnable state  
	    // Running state of Thread1 and Thread2  
	    t1.start();  
	    // Move control to another thread  
	    t2.yield();  
	    // Blocked State Thread1  
	    try   
	    {  
	        t1.sleep(1000);  
	    }   
	    catch (InterruptedException e)   
	    {  
	        e.printStackTrace();  
	    }  
	    t2.start();  
	    System.out.println("Main Thread End");  
	}

}
