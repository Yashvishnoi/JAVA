import java.util.Scanner;
class College{  
void CollegeName(){
	
	System.out.println("UPES");}  
}  
class Branch extends College{  
void BranchName(){
	System.out.println("Computer Science"); 
}  
}
class Specialization extends Branch{  
void SpecializationName(){System.out.println("DevOps");}  
}  
class Inheritance{  
public static void main(String args[]){  
Specialization s=new Specialization();  
s.CollegeName();  
s.BranchName();  
s.SpecializationName();  
}}  
