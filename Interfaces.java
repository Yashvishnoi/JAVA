interface Bicycle {
	void ApplyBreak(int decrement);
	void SpeedUP(int increment);
}

interface GearBox {
	void Gearup();
	void GearDown();
}


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
		AvonCycle AC = new AvonCycle();
		AC.ApplyBreak(1);
		AC.SpeedUP(2);
		AC.Gearup();
		AC.GearDown();
		
	}

}
