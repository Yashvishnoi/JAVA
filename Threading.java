
	
	class MyThread1 extends Thread {
		public void run() {
			while(true) {
				System.out.println("This is thread1");
				System.out.println("I am Happy");
			}
		}
	}
	
	class MyThread2 extends Thread {
		public void run() {
			while(true) {
				System.out.println("Thread2 is BOSS");
				System.out.println("I am UnHappy");
			}
		}
	}
public class Threading {
	public static void main(String[] args) {	
		MyThread1 t1 = new MyThread1();
		MyThread2 t2= new MyThread2();
		
	}
}
