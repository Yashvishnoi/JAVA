import java.util.Scanner;
public class Checked_and_Unchecked_Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a");
		int a=sc.nextInt();
	
		System.out.println("Enter value of b");
		int b= sc.nextInt();
		System.out.println("Entered value of a and b is "+a+" & "+b);
		
		
		int c= a/b;
		System.out.println("Divison of a and b is "+c);
	}
}
