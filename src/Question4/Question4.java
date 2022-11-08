package Question4;


class Base {

private static void display() {

System.out.println("Static or class method from Base");

}

public void print() {

System.out.println("Non-static or instance method from Base");

}
}
class Derived extends Base {

private static void display() {

System.out.println("Static or class method from Derived");

}

public void print() {

System.out.println("Non-static or instance method from Derived");

}
}
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base obj= new Derived();
    // commented this code as it will throw an error
	//	obj.display(); 

		obj.print();
	} 

}
