public class Threading {
	
	class MyThread1 extends Thread {
		public void run() {
			while(true) {
				System.out.println("This is thread1");
				System.out.println("I am Happy");
			}
		}
	}
	
	public static void main(String[] args) {	
	}

}
