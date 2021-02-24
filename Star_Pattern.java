import java.util.Scanner;
public class Star_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a =sc.nextInt();
		for(int i =a; i>0 ; i--) {
			for(int j=i;j>0;j--) {
				System.out.printf("* ");
			}
			System.out.println("\n");
		}
		
		
	}

}
