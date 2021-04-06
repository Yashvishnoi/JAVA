
class MyThread11 implements Runnable{
	public void run() {
		System.out.println("I am Thread using Runnable class");
	}
}

class MyThread22 implements Runnable{
	public void run() {
		System.out.println("Runnable class");
	}
}

public class Threading2 {

	public static void main(String[] args) {
		MyThread11 t1 =new MyThread11();
		MyThread22 t2 =new MyThread22();
		
	}

}
