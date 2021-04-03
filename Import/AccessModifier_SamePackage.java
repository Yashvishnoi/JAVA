package Import;

class c1 {
	public int x=5;
	protected int y=45;
	int z=6;
	private int a = 38;
	
	public void meth1() {
		System.out.println(x); // Uses public modifier in same class
		System.out.println(y);// Uses protected modifier in same class
		System.out.println(z);// Uses default modifier in same class
		System.out.println(a); // Uses private modifier in same class
	}
}
	
public class AccessModifier_SamePackage {

	public static void main(String[] args) {
		c1 c= new c1();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
	//	System.out.println(c.a); This we can't access because of a is private modifier
		
	}
}
