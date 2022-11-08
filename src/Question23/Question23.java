package Question23;
class ImmutableValue{

	  private int value = 0;

	  public ImmutableValue(int value){
	    this.value = value;
	  }

	  public int getValue(){
	    return this.value;
	  }

	  
	      public ImmutableValue add(int valueToAdd){
	      return new ImmutableValue(this.value + valueToAdd);
	      }
	  
	}
public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableValue obj = new ImmutableValue(10);
		obj = obj.add(1);
		System.out.println(obj.getValue());

	}

}
