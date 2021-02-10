import  java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
			case 18:
				System.out.println("You are Adult . Enjoy!! ");
				break;
			case 20 : 
				System.out.println("Hold Responsibilities :} ");
				break;
			default:
				System.out.println("Oops Sorry :) ");
		}
	}

}
