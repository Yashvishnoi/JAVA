
public class String_PracticeSet {

	public static void main(String[] args) {
		String name = "YASH Boi";
		
		System.out.println(name.toLowerCase()); // Convert to lower case
		
		System.out.println(name.replace(" ", "_"));// Change Space into underscore
		
		String letter = "Dear <|name|> , Thanks a lot !! :) "; // Replace <|name|> from some word
		letter = letter.replace("<|name|>", "Harry");
		System.out.println(letter);
		
		String myString = "This String  contain   double or triple space";
		System.out.println("The index of double space is "+myString.indexOf("  "));
		System.out.println("The index of triple space is " + myString.indexOf("   "));// -1 will show if there is not 
		
		System.out.println("\"Dear Harry , This Java Course is nice. Thanks\"");
	}

}
