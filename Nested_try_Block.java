public class Nested_try_Block {

	public static void main(String[] args) {
		  try {
		         int a[]= {10,20,30,40,50};
		         
		         try {
		            System.out.println("Division");
		            int res = 100/ 0;
		         }
		         catch (ArithmeticException ex2) {
		            System.out.println("Sorry! Division by zero isn't feasible!");
		         }
		         System.out.println(a[12]);
		      }
		      catch (ArrayIndexOutOfBoundsException ex1) {
		         System.out.println("ArrayIndexOutOfBoundsException");
		      }
		   }

	}

