// Fibonacci Series
import java.util.Scanner;
public class Recursion {
	static int a=0 , b = 1, c=0 ;
	static void fibonacci(int count) {
		if(count>0) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(" "+c);
			fibonacci(count -1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count  = sc.nextInt();
		System.out.println(" "+a+" \n"+" "+b);
		fibonacci(count-2);
		
		
	}

}
