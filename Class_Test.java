import java.util.Scanner;

public class Class_Test {
	
	static void Frequency(String str) {
		String str1=str.toLowerCase()+".";
		String st[] = str1.split(str);

		System.out.println("Frequency of '"+str+"' in String '"+str+"' is : "+(st.length-1));
	}
	
	static int count (String str) {
		int c = str.split(" ").length;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the String: ");
		String s = sc.nextLine();
		System.out.println("Number of words ="+count(s));
		System.out.println("Frequency");
		System.out.println("Enter Word/letter for which you have to find frequency : ");
		String letter = sc.nextLine();
		Frequency(letter);
		
	}
}
