// RUN TIME POLYMORPHISM

class Bank {
	float RateOfInterest() {
		return 0;
	}
}

class ICICI extends Bank {
	float RateOfInterest() {
		return 2.5f;
	}
}

class HDFC extends Bank {
	float RateOfInterest() {
		return 5.2f;
	}
}

class AXIS extends Bank {
	float RateOfInterest() {
		return 6.7;
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println("Rate of Interest "+ b.RateOfInterest());
	}

}
