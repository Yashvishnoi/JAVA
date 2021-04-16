// Create thread using extending thread class	
	class MyThread1 extends Thread {
		public void run() {
			int i=1;
			while(i<=10) {
				System.out.println("This is thread1"+Thread.currentThread().getName());
				System.out.println("Thread Priority" +Thread.currentThread().getPriority() );
				i++;
			}
		}
	}
	
	
public class Threading {
	public static void main(String[] args) {	
		MyThread1 t1 = new MyThread1();
		MyThread1 t2= new MyThread1();

		t1.setPriority (Thread.MIN_PRIORITY);
        t2.setPriority (Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}
