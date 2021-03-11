
interface Bicycle {
	int a=45;
	void ApplyBreak(int decrement);
	void SpeedUP(int increment);
}// In interface class all methods are abstract it is neccesary to write down the body in subclass.

interface GearBox {
	void Gearup();
	void GearDown();
}

class RangerCycle implements Bicycle{

	@Override
	public void ApplyBreak(int decrement) {
		System.out.println("Break applied KIIIIII>>>><<<");
	}

	@Override
	public void SpeedUP(int increment) {
		System.out.println("Speed UP BHOOOO.....>>>");
	}
}

// We can create more non-abstract methods then parent class
class AvonCycle implements Bicycle,GearBox {
	void blowhorn() { 
		System.out.println("Pee Poo Pee Poo :)");
	}
	
	public void ApplyBreak(int decrement) { 
		System.out.println("Break Applied");
	}
	
	public void SpeedUP(int increment) {
		System.out.println("Speed UP");
	}
	
	public void Gearup() {
		System.out.println("Gear Up");
	}
	
	public void GearDown() {
		System.out.println("Gear Down");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RangerCycle R = new RangerCycle();
		System.out.println(R.a);
		
		
		AvonCycle AC = new AvonCycle();
		AC.ApplyBreak(1);
		AC.SpeedUP(2);
		AC.Gearup();
		AC.GearDown();
		
	}

}
