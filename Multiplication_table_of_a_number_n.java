import java.util.Scanner;
public class Multiplication_table_of_a_number_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+i*n );
		}
		
	}

}
