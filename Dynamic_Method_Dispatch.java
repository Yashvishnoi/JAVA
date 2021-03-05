class Phone {
	void Calling () {
		System.out.println("We can call...");
	}
	
	void Music () {
		System.out.println("Music can play in any phone...");
	}
	
}

class SmartPhone extends Phone {
	@Override
	void Music() {
		System.out.println("Music through Jio Savaan...");
	}
	
	void Game() {
		System.out.println("We can play PUBG");
	}
}
public class Dynamic_Method_Dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone P = new SmartPhone() ;
		P.Calling();
		P.Music(); // This invokes Music of Derived Class
	//	P.Game(); This we can't access 
		
	}

}
