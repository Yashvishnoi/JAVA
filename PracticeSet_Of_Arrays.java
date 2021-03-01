import java.util.Scanner;
public class PracticeSet_Of_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

// 1. Array of 5 floats and calculate their sum	
/*		System.out.println("Problem 1");
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
		}
		
		// This is done using for each loop
		for(float element:array) {
			sum = sum+element;
		}
		
		System.out.println("Sum ="+sum);
*/
		
		
// 2. Wheather an element is present in array or not
/*		System.out.println("Problem 2");
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
*/				



// 3. Calculate the average marks from array using for each loop	
/*	System.out.println("Problem 3");
	float [] Physic = {10.5f,20.5f,60.8f, 69.69f , 41.5f};
	float avg;
	float sum=0;
	for(float element:Physic) {
		sum=sum+element;
	}
	avg = sum /  (Physic.length);
	System.out.println("The average of Physic marsks ="+avg );
	
*/
		
		
		
// 4. Adding 2d matrices of size [2][3];
/*	
 	system.out.println("Problem 4");
	int [][] mat1 = {{1, 2, 3},
            	{4, 5, 6}};
    int [][] mat2 = {{2, 6, 13},
            	{3, 7, 1}};
    int [][] result = {{0, 0, 0},
              	{0, 0, 0}};

    for (int i=0;i<mat1.length;i++){ // row number of times
    	for (int j=0;j<mat1[i].length;j++) { // column number of time
    		System.out.format(" Setting value for i=%d and j=%d\n", i, j);
    		result[i][j] = mat1[i][j] + mat2[i][j];
    	}
    }

    // Printing the elements of a 2-D Array
    for (int i=0;i<mat1.length;i++){ // row number of times
    	for (int j=0;j<mat1[i].length;j++) { // column number of time
    		System.out.print(result[i][j] + " ");
    		result[i][j] = mat1[i][j] + mat2[i][j];
    	}
    	System.out.println(""); // Prints a new line
    }
*/
  
		
// 5.  Wheather a array is sorted or not
		System.out.println("Problem 5");
		boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
	}
	
}

