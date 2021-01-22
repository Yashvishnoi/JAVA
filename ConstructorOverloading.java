import java.util.Scanner;
class Constructor{
	static int x,y;
	public Constructor(){
		
	}
	public  Constructor(int a, int b) {
        x=a;
        y=b;
    }

}
public class ConstructorOverloading {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the input for constructor");
			int a=in.nextInt();
			int b=in.nextInt();
			in.close();
			Constructor obj1=new Constructor();
			System.out.println("Default Constructor:"+obj1.x);
			System.out.println("Default Constructor:"+obj1.y);
			
			Constructor obj2=new Constructor(a,b);
			System.out.println("Parametrized Constructor:"+obj2.x);
	        System.out.println("Parametrized Constructor:"+obj2.y);
		}
}

