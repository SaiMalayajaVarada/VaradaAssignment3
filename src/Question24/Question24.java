package Question24;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Runtime.getRuntime().freeMemory());
	      for (int i=0; i<= 100000; i++) {
	         Double d = new Double(300);
	      }
	      System.out.println(Runtime.getRuntime().freeMemory());
	      System.gc();
	      System.out.println(Runtime.getRuntime().freeMemory());
	}

}
