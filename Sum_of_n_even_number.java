import java.util.Scanner;
public class Sum_of_n_even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum=sum+2*i;
		}
		System.out.println("Sum of n even numbers is: "+sum);
		
	}
}
