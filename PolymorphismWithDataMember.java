//A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.

class Bike{
	int SpeedLimit = 80;
}

class Splender extends Bike {
	int SpeedLimit = 100;
}

class GSA1200 extends Bike{
	int SpeedLimit = 200;
}

class Ninja1000 extends Bike {
	int SpeedLimit = 300;
}


public class PolymorphismWithDataMember {

	public static void main(String[] args) {
		Bike  b = new Bike();
		System.out.println("Max Speed=" + b.SpeedLimit);
	}
		 
		
}
