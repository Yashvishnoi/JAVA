import java.util.Random;
import java.util.Scanner;

public class Stone_Paper_Scissor {

	public static void main(String[] args) {
		System.out.println(" 0 = Stone \n 1 = Paper \n 2 = Scissor ");
		Random random = new Random(); 
		int rand_number = random.nextInt(3);
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println("\n\nYou entered: "+a);
		System.out.println("Computer Entered: "+rand_number);
		if(a==0 && rand_number==0 ) {
			System.out.println("0 point for both");
		}
		else if(a==1 && rand_number==1 ) {
			System.out.println("0 point for both");
		}
		else if(a==2 && rand_number==2 ) {
			System.out.println("1 point for Computer");
		}
		else if(a==0 && rand_number==1 ) {
			System.out.println("1 point for Computer");
		}else if(a==0 && rand_number==2 ) {
			System.out.println("1 point for You");
		}else if(a==1 && rand_number==0 ) {
			System.out.println("1 point for You");
		}else if(a==1 && rand_number==2 ) {
			System.out.println("1 point for Computer");
		}else if(a==2 && rand_number==1 ) {
			System.out.println("1 point for You");
		}else if(a==2 && rand_number==0 ) {
			System.out.println("1 point for Computer");
		}
	}

}
