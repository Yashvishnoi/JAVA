
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
		System.out.println("Substring(3) "+name.substring(3)); // it will print from 3rd position till end in case of harry it will print ry.
		System.out.println("Substring(2,4) "+name.substring(2, 4)); // start string included and end string excluded.
		System.out.println("Returns after replacing r with p = " + name.replace('r', 'p')); // It will replace all r with p
		System.out.println("Returns true or false in this case = "+name.startsWith("Ha") ); // It will check whether string start with ha or not
		System.out.println("Returns true or false in this case = "+ name.endsWith("ky") ); // It will check whether string end with ry or not
		System.out.println("Returns Character at given index " + name.charAt(2)); // Returns character at that position
		System.out.println("Returns index of the given String "+ name.indexOf("ar"));
		System.out.println("Wheather given string matches or not = "+ name.equals("Harry")); // It is case sensitive
		System.out.println("It matche the given string matches or not without case senstive " + name.equalsIgnoreCase("harry") );
		System.out.println("Hi this is \"Yash "); // it will print the string like "Yash"
		System.out.println("Hi this is \\ yash "); // It's output will be 'Hi this is \ yash'
	}

}
