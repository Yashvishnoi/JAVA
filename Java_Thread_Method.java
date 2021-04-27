
class ThreadMethod1 extends Thread{
	public void run() {
		while(true) {
			System.out.println("Thank You 1111");
		}
	}
}

class ThreadMethod2 extends Thread{
	
	public void run() {
		while(true) {
			System.out.println("Thank You 2222");
		}
	}
}
public class Java_Thread_Method {
	public static void main(String[] args) {
		ThreadMethod1 t1 = new ThreadMethod1();
		ThreadMethod1 t2 = new ThreadMethod1();
		t1.start();
		t2.start();
	}
}
