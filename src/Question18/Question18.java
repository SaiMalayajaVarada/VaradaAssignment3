package Question18;
 class ThreadTwice extends Thread {
	public void run() {
		System.out.println("running...");
	}
 }
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTwice t = new ThreadTwice();
		t.start();
		t.start();


	}

}
