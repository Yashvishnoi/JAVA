// Calculate income for paid by an employee to the goverment as per the slabs mentioned below:
import java.util.Scanner;
public class PracticeSwitchCase2  {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float tax = 0;
		System.out.println("Enter the salary in lakhs ");
		float slab = sc.nextFloat();
		
		if(slab>2.5f && slab<5.0f) {
			System.out.println("You pay 5% of tax");
			tax = tax + 0.05f*(slab-2.5f);
		}
		
		if(slab>5.0 && slab<10.0) {
			System.out.println("Pay 20% tax");
			tax = tax + 0.05f*(5.0f-2.5f);
			tax = tax + 0.2f*(slab-5f);
		}
		else if(slab>10.0){
			System.out.println("Pay 30% tax");
			tax = tax + 0.05f*(5.0f-2.5f);
			tax = tax + 0.2f*(10.0f-5f);
			tax = tax + 0.3f*(slab-10f);
		}
		else {
			System.out.println("No tax chaos !! ");
		}
	System.out.println("Tax Amount = " + tax + "lakh");
	}
	
	

}
