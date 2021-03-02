// Factorial of a number 
import java.util.Scanner;
public class Recursion_CWH {
	
	static int factorial(int x) {
		
		if(x==0 || x== 1) {
			return 1;
		}
		else {
			return x * factorial(x-1); 
		}
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	int c = factorial(n);
	System.out.println("Factorial of a number is "+c);

	}

}
