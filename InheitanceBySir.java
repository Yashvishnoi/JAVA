class Employee

{
	int id,basicSal,sa,hra,da;
	String name;

	Employee(String n,int ID,int b,int SA,int HRA,int DA)
	{

        name=n;

        id=ID;

        basicSal=b;

        sa=SA;

        hra=HRA;

        da=DA;

    }

    public int calculateSalary()

    {

       return basicSal+sa+hra+da;

    }

}



class Manager extends Employee

{

    Manager(String n,int ID,int b,int SA,int HRA,int DA)

    {

       super(n,ID,b,SA,HRA,DA);

    }



    public int calculateSalary()

    {

       return basicSal+sa*2+hra+da;

    }

}



class ProjectManager extends Manager

{

    ProjectManager(String n,int ID,int b,int SA,int HRA,int DA)

    {

       super(n,ID,b,SA,HRA,DA);

    }

    public int calculateSalary()

    {

       return basicSal+sa*2+hra*2+da;

    }

}



	 class InheritanceBySir {
    public static void main(String[] args) {

        Employee e=new Employee("Himanshu Kumar Gupta",45,500,1500,2000,4000);

        System.out.println("Salary of Employee = "+e.calculateSalary());



        Manager m=new Manager("Golu",45,500,1500,2000,4000);

        System.out.println("Salary of Manager = "+m.calculateSalary());

        



        ProjectManager p=new ProjectManager("Sonu",45,500,1500,2000,4000);

        System.out.println("Salary of ProjectManager = "+p.calculateSalary());



    }

}