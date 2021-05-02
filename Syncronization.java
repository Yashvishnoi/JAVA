class Aa {
	synchronized void addnew(int i) {
		Thread t = Thread.currentThread();
		for(int n=1;n<=5;n++) {
			System.out.println(t.getName() +" "+(i+n));
		}
	}
}

class Ba extends Thread {
	Aa a1 = new Aa();
	public void run() {
		a1.addnew(100);
	}
}
public class Syncronization {

	public static void main(String[] args) {
		Ba b = new Ba();
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		t2.start();
	}

}
