package Question2;

class A {
    protected void method()
    {
        System.out.println("Hello");
    }
}
public class Question2 extends A {
	 public void method()
	    {
	        System.out.println("Hello");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question2 b = new Question2();
	     b.method();

	}

}
