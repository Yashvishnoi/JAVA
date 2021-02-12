// Calculate income for paid by an employee to the goverment as per the slabs mentioned below:
import java.util.Scanner;
public class PracticeSwitchCase2  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary in lakhs ");
		double slab = sc.nextDouble();
		if(slab>2.5 && slab<5.0) {
			System.out.println("Pay tax 5% ");
		}
		else if(slab>5.0 && slab<10.0) {
			System.out.println("Pay 20% tax");
		}
		else if(slab>10.0){
			System.out.println("Pay 30% tax");
		}
		else {
			System.out.println("No tax chaos !! ");
		}
	}

}
