import java.util.Scanner;
public class Elements_of_array_reverse_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] array = new int [5];
		//int [] array = {5,4,3,2,1};
		int i;
		for(i=0;i<5;i++) {
			System.out.println("Enter the value of array at index "+ i);
			array[i] =sc.nextInt();
		}
		
		for(i=4;i>=0;i--) {
			System.out.println("The value at index "+i+" = "+array[i]);
		}
	}

}
