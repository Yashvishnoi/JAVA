package codewithharry.Gym;

public class harryGym {
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
    public void hey() {
        System.out.println("Hello");
    } 
    public static void main(String[] args) {
        System.out.println("This is harry Gym");
    }
}