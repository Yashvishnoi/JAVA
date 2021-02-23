// Natural number in increasing and decreasing order
import java.util.Scanner;

public class For_Loops {

	public static void main(String[] args) {
		System.out.println("Enter the value of n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		System.out.println("\nNatural Number in increasing order");
		for(int i=0;i<=n;i++) {
			System.out.println(i);
		}
		
		System.out.println("\nNatural number in decreasing order ");
		for(int i=n;i>=0;i--) {
			System.out.println(i);
		}
	}

}
