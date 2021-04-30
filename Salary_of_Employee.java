class Employez{
    int ID;
    String name;
    double basic, SA, HRA, DA;
    Employez(){
        
    }
    Employez(int a, String n, int b, int c, int d, int e){
        ID = a;
        name = n;
        basic = b;
        SA = c;
        HRA = d;
        DA = e;
    }
    
    void calSalary() {
        System.out.println("Salary of the employee is: " + (basic+SA+HRA+DA));
    }
    
}

class Manager extends Employez{
    Manager(int a, String n, int b, int c, int d, int e){
        ID = a;
        name = n;
        basic = b;
        SA = c;
        HRA = d;
        DA = e;
    }
    
    void calSalary() {
        System.out.println("Salary of the employee is: " + (basic+2*SA+HRA+DA));
    }
    
}

class ProjectMan extends Employez{
    ProjectMan(int a, String n, int b, int c, int d, int e){
        ID = a;
        name = n;
        basic = b;
        SA = c;
        HRA = d;
        DA = e;
    }
    
    void calSalary() {
        System.out.println("Salary of the employee is: " + (basic+2*SA+2*HRA+DA));
    }
}
public class Salary_of_Employee {
    public static void main(String[] args) {
        Employez emp1 = new Employez(1001, "Phagun", 10000, 500, 250, 450);
        Manager man1  = new Manager(10001, "Jain", 2000, 1000, 500, 450);
        ProjectMan proj1 = new ProjectMan(100001, "Akash", 5000, 200, 500, 450);
        
        emp1.calSalary();
        System.out.println();
        man1.calSalary();
        System.out.println();
        proj1.calSalary();
    }
}