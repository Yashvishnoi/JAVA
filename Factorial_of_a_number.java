import java.util.Scanner;
public class Factorial_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int sum=1;
		int i;
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		for( i=n;i>0;i--) {
			sum= sum*i;
		}
		System.out.printf("Factorial of %d number is %d" ,n,sum);
	}

}
