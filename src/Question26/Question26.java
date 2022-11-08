package Question26;
/**
 * Eager Initialized Singleton Example
 */
 class EagerInitializedSingletonExample {
  private static volatile EagerInitializedSingletonExample instance =
      new EagerInitializedSingletonExample();
  //private constructor.
  private EagerInitializedSingletonExample() {
  }
  public static EagerInitializedSingletonExample getInstance() {
    return instance;
  }
}

/**
 * Lazy Initialized Singleton Example
 */
class LazyInitializedSingletonExample {
  private static LazyInitializedSingletonExample instance;
  private LazyInitializedSingletonExample() {
  }  //private constructor.
  public static LazyInitializedSingletonExample getInstance() {
    if (instance == null) {
      //if there is no instance available... create new one
      instance = new LazyInitializedSingletonExample();
    }
    return instance;
  }
}
public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazyInitializedSingletonExample instance1 = LazyInitializedSingletonExample.getInstance();
	    //Instance 2
	    LazyInitializedSingletonExample instance2 = LazyInitializedSingletonExample.getInstance();
	    //now lets check the hash key.
	    System.out.println("Instance 1 hash:" + instance1.hashCode());
	    System.out.println("Instance 2 hash:" + instance2.hashCode());

	}

}

/**
 * Lazy Initialized Singleton Example
 */
 class LazyInitializedSingletonExample1 {
  private static LazyInitializedSingletonExample1 instance;
  //private constructor.
  private LazyInitializedSingletonExample1() {
    if (instance != null) {
      throw new RuntimeException(
          "Use getInstance() method to get the single instance of this class.");
    }
  }
  public static LazyInitializedSingletonExample1 getInstance() {
    if (instance == null) {
      //if there is no instance available... create new one
      synchronized (LazyInitializedSingletonExample1.class) {   //Check for the second time.
        //if there is no instance available... create new one
        if (instance == null) instance = new LazyInitializedSingletonExample1();
      }
    //  instance = new LazyInitializedSingletonExample();
    }
    return instance;
  }
}
