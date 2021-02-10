import java.util.Scanner;
public class SwitchCasePractice {
 // Question Enter 3 sub marks , sum is greater than 40 and each sub is greater than 33
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks in SEPM: ");
		int SEPM = sc.nextInt();
		System.out.println("Enter marks in BRM: ");
		int BRM = sc.nextInt();
		System.out.println("Enter marks in Advance Linux: ");
		int AL  = sc.nextInt();
		float avg = (SEPM+BRM+AL)/3.0f;
		if(avg>40 && SEPM>33 && BRM>33 &&AL>33) {
			System.out.println("Pass!!, Chaos :) ");
		}
		else {
			System.out.println("Fail, Better Luck Next Time :{ ");
		}
	}

}
