/*
import java.util.Scanner;
public class Methods {
	static int logic(int x,int y) {
		int z;
		if(x>y) {
			z=x+y;	
		}
		else {
			z=(x+y)* 2;
		}
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c;
		c=  logic (a,b);
		System.out.println("The value of c = "+c);
	}

} */


// Calling Method using object 
import java.util.Scanner;
public class Methods {
	 int logic(int x,int y) {
		int z;
		if(x>y) {
			z=x+y;	
		}
		else {
			z=(x+y)* 2;
		}
		return z;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c;
		Methods obj = new Methods();
		c= obj. logic (a,b);
		System.out.println("The value of c = "+c);
	}

}