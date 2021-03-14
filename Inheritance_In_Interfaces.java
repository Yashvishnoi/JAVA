interface Animals {
	void Dog();
	void cat();
}

interface wildAnimal extends Animals {
	void Lion();
	void Fox();
}

class Sounds implements wildAnimal {

	@Override
	public void Dog() {
		System.out.println("Barks...");
	}

	@Override
	public void cat() {
		System.out.println("Meow...");
	}

	@Override
	public void Lion() {
		System.out.println("Roar...");
	}

	@Override
	public void Fox() {
		System.out.println("Awwww...");
	}
	\
}

public class Inheritance_In_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
