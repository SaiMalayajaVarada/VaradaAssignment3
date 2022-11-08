package Question21;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Employee implements Serializable{
       private static final long serialVersionUID = 1L; //Serial Version UID
       int id;
       String name;
       public Employee(int id, String name) {
             this.id = id;
             this.name = name; 
       }
}

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     try{
             Employee emp1 =new Employee(20110,"John");
             Employee emp2 =new Employee(22110,"Jerry");
             Employee emp3 =new Employee(20120,"Sam");
             FileOutputStream fout=new FileOutputStream("output.txt");
             ObjectOutputStream out=new ObjectOutputStream(fout);
             out.writeObject(emp1);
             out.writeObject(emp2);
             out.writeObject(emp3);
             out.flush();
             out.close();
             System.out.println("Serialization and Deserialization is been successfully executed");
      }
      catch(Exception e){
             System.out.println(e);}
      }
	}


