import java.util.Scanner;

public class FirstLetterCapital {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
	    String input = sc.nextLine();	    
	    
	    char[] charArray = input.toCharArray();
	    boolean foundSpace = true;
	    for(int i = 0; i < charArray.length; i++) {
	      if(Character.isLetter(charArray[i])) {
	        if(foundSpace) {  
	          charArray[i] = Character.toUpperCase(charArray[i]);
	          foundSpace = false;
	        }
	      }
	      else {
	   
	        foundSpace = true;
	      }
	    }
	    input = String.valueOf(charArray);
	    System.out.println("Message: " + input);
	  }
	}