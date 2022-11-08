package Question27;
/**
 * Lazy Initialized Singleton Example
 */
 class LazyInitializedSingletonExample {
  private static LazyInitializedSingletonExample instance;
  //private constructor.
  private LazyInitializedSingletonExample() {
    if (instance != null) {
      throw new RuntimeException(
          "Use getInstance() method to get the single instance of this class.");
    }
  }
  public synchronized static LazyInitializedSingletonExample getInstance() {
    if (instance == null) {
      //if there is no instance available... create new one
      instance = new LazyInitializedSingletonExample();
    }
    return instance;
  }
}
public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Thread 1
	    Thread t1 = new Thread(new Runnable() {
	      @Override
	      public void run() {
	        LazyInitializedSingletonExample instance1 = LazyInitializedSingletonExample.getInstance();
	        System.out.println("Instance 1 hash:" + instance1.hashCode());
	      }
	    });
	    //Thread 2
	    Thread t2 = new Thread(new Runnable() {
	      @Override
	      public void run() {
	        LazyInitializedSingletonExample instance2 = LazyInitializedSingletonExample.getInstance();
	        System.out.println("Instance 2 hash:" + instance2.hashCode());
	      }
	    });
	    //start both the threads
	    t1.start();
	    t2.start();

	}

}
