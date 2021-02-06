
class Student {
	int SapId;
	String name;
	static int RollNo = 0;
	static String college = "upes";
// Constructor

	Student (int s ,String n) {
		SapId= s;
		name = n;
		RollNo++;
	}
	
	
}
public class static_and_nonStatic {

	public static void main(String[] args) {
		Student s1 = new Student(500077690,"Vijay");
		System.out.println(s1.RollNo);
		System.out.println(s1.college);
		Student s2 = new Student(500077611,"Aman");  

		System.out.println(s2.RollNo);  
		System.out.println(s2.college);
	}

}