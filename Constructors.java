import java.util.Scanner;

class MyEmployee {
	private int salary;
	private String name;
	
	public MyEmployee() {
		System.out.println("This is default Constructor");
		salary = 15000;
		name = "Shakal";
	}
	
	public MyEmployee(int s, String n) {
		System.out.println("Constructor called");
		salary =s;
		name=n;
	}
	
	public void Return () {
		System.out.printf("The name of  a person is %s \n",name);
		System.out.printf("The salary of a person is %d \n",salary);
	
	}
	
	
	
}

public class Constructors {
	

	public static void main(String[] args) {
		
		MyEmployee E = new MyEmployee();
		E.Return();
		
		MyEmployee E1 = new MyEmployee(102000,"Mukesh");
		E1.Return();
	}

}
