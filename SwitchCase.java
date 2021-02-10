import  java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String var = sc.nextLine();
		switch (var) {
			case "Subham" -> {
				System.out.println("You are Adult . Enjoy!! ");
				System.out.println("You are Adult . Enjoy!! ");
				System.out.println("You are Adult . Enjoy!! ");
				System.out.println("You are Adult . Enjoy!! ");
			}
			case "Yash" -> { 
				System.out.println("Hold Responsibilities :} ");
				System.out.println("Hold Responsibilities :} ");
				System.out.println("Hold Responsibilities :} ");
				
			}
			default ->{
				System.out.println("Oops Sorry :) ");
			}
			}
			
			
	}

}
/*		int a = sc.nextInt();
switch (a) {
	case 18:
		System.out.println("You are Adult . Enjoy!! ");
		break;
	case 20 : 
		System.out.println("Hold Responsibilities :} ");
		break;
	default:
		System.out.println("Oops Sorry :) ");
}*/