
class ThreadMethod1 extends Thread{
	public void run() {
		int i=0;
		while(true) {
			System.out.println("Thank You 1111");
			try {
				Thread.sleep(455);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}  
	}
}

class ThreadMethod2 extends Thread{
	
	public void run() {
		while(true) {
			System.out.println("My Thank You 2222");
		}
	}
}
public class Java_Thread_Method {
	public static void main(String[] args) {
		ThreadMethod1 t1 = new ThreadMethod1();
		ThreadMethod2 t2 = new ThreadMethod2();
		t1.start();
		try {
			t1.join(); // it will print t1.start() until it wiil b fifnished
		} catch (Exception e) {
			System.out.println(e);
	}
		t2.start();
	}
}
