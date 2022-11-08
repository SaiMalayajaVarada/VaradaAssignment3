package Question7;

class Sample{
	int i;
	
	//commented the code as declaring constructor with final keyword throws a compile time error
/*	final Sample() {
		i = 1;
	}
	*/  
	void test(){
		System.out.println("test");
	}
}

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.test();
	}

}
