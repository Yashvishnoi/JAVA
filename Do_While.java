// Print n natural number using do-while loop
import java.util.Scanner;
public class Do_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value ");
		
		int n=sc.nextInt();
		int b=0;
		do {
			System.out.println(b);
			b++;
		}while(b<n);
		
		System.out.println("Enter the n value ");
		
		
	}

}
