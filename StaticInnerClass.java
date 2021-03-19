// Static Inner Class

public class StaticInnerClass {
	static int cost = 512;
	static class Swift {
		void Price() {
			System.out.println("Swift cost is $"+cost);
		}
	}
	
	public static void main(String[] args) {
		StaticInnerClass.Swift s = new StaticInnerClass.Swift();
		s.Price();
	}
}
