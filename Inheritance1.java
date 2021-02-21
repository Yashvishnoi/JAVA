class Employee {
	int Id,BasicSal,SA,HRA,DA;
	String Name;
	
	Employee(String Name,int Id,int BasicSal,int SA, int HRA, int DA) {
		this.Name=Name;
		this.Id=Id;
		this.BasicSal= BasicSal;
		this.SA=SA;
		this.HRA=HRA;
		this.DA=DA;
	}
	
	 public int Salary() {
		return BasicSal+SA+HRA+DA;
	}

}

class Manager extends Employee {
	
	Manager(String Name,int Id,int BasicSal,int SA, int HRA, int DA){
		super( Name, Id,BasicSal, SA,  HRA, DA);
	}
	
	public int Salary() {
		return BasicSal+SA+HRA+DA;
	}
}

class ProjectManager extends  Manager {
	
}

public class Inheritance1 {

	public static void main(String[] args) {
		

	}

}
