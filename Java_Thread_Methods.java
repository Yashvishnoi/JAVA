class MyNewThread extends Thread {
	public MyNewThread(String name) {
		super(name);
	}
	public void rn() {
		while(true) {
			System.out.println("I am a thread");
			System.out.println("Thank you: ");
		}
	}
}

class MyNewThread2 extends Thread {
	public MyNewThread2(String name) {
		super(name);
	}
	public void rn() {
		while(true) {
			System.out.println("Thread 2");
			System.out.println("Welcome");
		}
	}
}
public class Java_Thread_Methods {
	public static void main(String[] args) {
		
	}
}
