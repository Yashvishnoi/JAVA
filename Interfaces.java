interface Bicycle {
	void ApplyBreak(int decrement);
	void SpeedUP(int increment);
}

class AvonCycle implements Bicycle {
	void blowhorn() { 
		System.out.println("Pee Poo Pee Poo :)");
	}
	
	public void ApplyBreak(int decrement) {
		System.out.println("Break Applied");
	}
	
	public void SpeedUP(int increment) {
		System.out.println("Speed UP");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
