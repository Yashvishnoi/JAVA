import java.util.Scanner;

class employee {
	int salary;
	String name;
	
	public int getSalary() {
		return salary;
	}
	
	public String getName () {
		return name;
	}
	
	public void  setName (String n) {
		name = n;
	}
}

public class Class_And_Its_Properties {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		employee E = new employee() ;
		System.out.println("Enter the name of employee");
		E.name = sc.nextLine();
		System.out.println("Enter the Salary");
		E.salary = sc.nextInt();
		
		System.out.println("The Entered name is "+E.getName());
		System.out.println("The entered Salary is "+E.getSalary());
		
		
		
	}

}
