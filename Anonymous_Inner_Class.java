abstract class OuterClass {
	public abstract void display();
}

public class Anonymous_Inner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass obj = new OuterClass() {
			public void display() {
				System.out.println("Thos is Anonymous class");
			}
		};
		obj.display();
	}

}
