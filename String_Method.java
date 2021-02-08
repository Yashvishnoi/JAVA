
public class String_Method {

	public static void main(String[] args) {
		String name = "Harry";// Index of harry 01234
		System.out.println(name);
		int value = name.length();// Length of string
		System.out.println("The length of string = "+value);
		String lstring = name.toLowerCase(); // Convert it into lowercase
		System.out.println("The lower string is "+lstring);
		String UString = name.toUpperCase();// Convert it into upper case
		System.out.println("The upper case of a String is "+UString);
		String nonTrimmedString = "   HarryBoi  ";
		System.out.println("The Untrimmed String "+ nonTrimmedString);
		System.out.println("The trimed string is " +nonTrimmedString.trim());// It will remove the Spaces of before and after the String
 	}

}
