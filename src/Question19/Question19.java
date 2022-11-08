package Question19;
//By extending thread class
class Multi extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
}
//By implementing Runnable interface
class Multi3 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
}
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi t1=new Multi();  
		t1.start();  
		
		Multi3 m1=new Multi3();  
		Thread t11 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
		t11.start();
	}

}
