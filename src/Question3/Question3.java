package Question3;
class BaseClass {
	public void get(){
	System.out.println("Base class");
	}
}
class Child extends BaseClass {
	public void get() {
	System.out.println("Child class");
}
}

 class Question3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass base = new Child();
		base.get();

	}

}
