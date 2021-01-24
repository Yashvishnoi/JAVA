import java.util.Scanner;

public class TakingInput {
	public static void main (String[] args) {
		System.out.println("Taking Input from the user \n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 \n");
		int a = sc.nextInt();
		System.out.println("Enter the 2 number");
		int b =  sc.nextInt();
		int sum =a+b;
		System.out.println("The sum of 2 number is ");
		System.out.println(sum);
	}
}
