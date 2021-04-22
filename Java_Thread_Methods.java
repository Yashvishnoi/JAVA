class MyNewThread1 extends Thread {s
	public void run() {
		while(true) {
			System.out.println("I am a thread");
			System.out.println("Thank you: ");
		}
	}
}

class MyNewThread2 extends Thread {
	
	public void run() {
		while(true) {
			System.out.println("Thread 2");
			System.out.println("Welcome");
		}
	}
}

public class Java_Thread_Methods {
	public static void main(String[] args) {
		MyNewThread1 t1 = new MyNewThread1(null);
		MyNewThread1 t2 = new MyNewThread1(null);
		t1.start();
		t2.start();
	}
}
