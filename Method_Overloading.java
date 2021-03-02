public class Method_Overloading {
	static void TellJoke() {
		System.out.println("I invented a new word !!\n" +"Plagiarism ");
		
	}
	static void Change(int x) {
		x=92;
	}
	public static void main(String[] args) {
		TellJoke();
		// TODO Auto-generated method stub
		int a= 10;
		System.out.println("\n\nValue of a before changing "+a);
		Change(a);
		System.out.println("Value of a after changing "+a);
		TellJoke();
	}

}
