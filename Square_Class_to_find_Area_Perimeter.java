import java.util.Scanner;

class Square {
	int length;
	
	void SetValue(int x) {
		length=x;
	}
	
	int Perimeter () {
		return 2*length;
	}
	
	int Area() {
		return 4*length;
	}
	
}

public class Square_Class_to_find_Area_Perimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the N Value");
		int N = sc.nextInt();
		
		Square s = new Square();
		s.SetValue(N);
		
		System.out.println("The perimeter of a square is "+ s.Perimeter());
		System.out.println("The area of a square is "+ s.Area());
		
	}

}
