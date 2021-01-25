import java.util.Scanner;
public class Excercise1_Calculator {

	public static void main(String[] args) {
		System.out.println("CBSE calculator \n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subject maximum marks \n");
		int max = sc.nextInt();
		System.out.println("Enter the 1st subject marks \n ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd subject marks \n ");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd subject marks \n ");
		int c = sc.nextInt();
		System.out.println("Enter the 4th subject marks \n ");
		int d = sc.nextInt();
		System.out.println("Enter the 5th subject marks \n ");
		int e = sc.nextInt();
		int sum= a+b+c+d+e;
		float per= sum*100/(5*max);
		System.out.println("Total % = "+per+"%" );
	}

}
