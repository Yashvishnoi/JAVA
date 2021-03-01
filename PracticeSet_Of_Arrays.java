import java.util.Scanner;
public class PracticeSet_Of_Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
// 1. Array of 5 floats and calculate their sum	
		float [] array = new float[5];
		int i;
		System.out.println("Enter the array values");
		for(i=0;i<array.length;i++) {
			array[i] = sc.nextFloat();
		}
		
		float sum =0;
		
		/* This is done using for loop
		for(i=0;i<array.length;i++) {
			sum=sum+array[i];
		}*/
		
		// This is done using for each loop
		for(float element:array) {
			sum = sum+element;
		}
		
		System.out.println("Sum ="+sum);
// 2.
	}

}
