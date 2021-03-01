import java.util.Scanner;
public class PracticeSet_Of_Arrays {

	public static void main(String[] args) {
		System.out.println("Problem 1");
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

		
		
// 2. Wheather an element is present in array or not
//		System.out.println("Problem 2");
		float [] Arry = {10.5f,20.5f,60.8f, 69.69f , 41.5f};
		float number = 60.8f;
		boolean isInArray = false;
		for(float element : Arry) {
			if(number==element) {
				isInArray=true;
				break;
			}
		}
		if(isInArray) {
			System.out.println("Number is present in Array");
		}
		else {
			System.out.println("Number is not present in Array");
		}
				
		}
	}

