package Question12;
import java.util.*;
import java.io.*;
 class FinalEx {  
    		//declaring final variable  
    		final int n = 1;  
    		void display() {      
    		// reassigning value to n variable gives compile time error  
    		//n = 2; 
    	}  
}
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalEx obj = new FinalEx();  
		// gives compile time error  
		obj.display();  
		
		try {
			System.out.println("Inside try block");
			// below code throws divide by zero exception
			int i = 25 / 0;
			System.out.println(i);
		}
		// handles the Arithmetic Exception / Divide by zero exception
		catch (ArithmeticException e) {
			System.out.println("Exception " + e);
		}
		// executes regardless of exception occurred or not
		finally {
			System.out.println("finally block executed");
		}
		System.out.println("after the finally block");
		Question12 obj1 = new Question12();
		// printing the hashcode
		System.out.println("Hashcode is: " + obj1.hashCode());
		obj = null;
		// calling the garbage collector using gc()
		System.gc();
		System.out.println("End of the garbage collection");

	
	}



	

protected void finalize() {
	System.out.println("Called the finalize() method");
	
}
}

