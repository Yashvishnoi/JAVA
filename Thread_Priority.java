class MyThr1 extends Thread {
	public MyThr1(String Name) {
		super(Name);
	}
	public void run() {
		int i=34;
		while(true) {
			System.out.println("Thank You"+this.getName());
		}
	}
}

public class Thread_Priority {
	public static void main(String[] args) {
		MyThr1 t1 = new MyThr1("Harry1");
		MyThr1 t2 = new MyThr1("Harry2");
		MyThr1 t3 = new MyThr1("Harry3");
		MyThr1 t4 = new MyThr1("Harry4");
		MyThr1 t5 = new MyThr1("Harry5 (Most Important )");
		t5.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
