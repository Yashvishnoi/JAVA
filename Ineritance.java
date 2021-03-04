class Base {
	int x;
	
	void setX (int x) {
		this.x=x;
	}
	
	void getX () {
		System.out.println("The value of x is "+x);
	}
	
}

class Derived extends Base {
	int y;
	
	void setY (int y) {
		this.y = y;
	}
	
	void getY () {
		System.out.println("The value of y is "+y);
	}
}
public class Ineritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d = new Derived();
		d.setX(15);
		d.getX();
		d.setY(20);
		d.getY();
	}

}
