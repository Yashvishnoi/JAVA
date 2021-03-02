public class Passing_Value_Array_Methods {
	static void TellJoke() {
		System.out.println("I invented a new word !!\n" +"Plagiarism ");
		
	}
	
	static void Change(int x) {
		x=92;
	}
	
	static void Change2(int[] arr) {
		arr[0] = 654;
	}
	public static void main(String[] args) {
		TellJoke();
		// TODO Auto-generated method stub
		int a= 10;
		System.out.println("\n\nValue of a before changing "+a);
		Change(a);
		System.out.println("Value of a after changing "+a);
		
		
		int[] arr = {10,25,36,85,105};
		System.out.println("\n\nThe value of array before Changing "+arr[0] );
		Change2(arr);
		System.out.println("The value of array after changing "+arr[0]);
	}

}
