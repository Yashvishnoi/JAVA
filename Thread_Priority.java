class MyThr1 extends Thread {
	public MyThr1(String Name) {
		super(Name);
	}
	public void run() {
		int i=34;
		System.out.println("Thank You");
	}
}

public class Thread_Priority {
	public static void main(String[] args) {
		MyThr1 t1 = new MyThr1("Harry");
		MyThr1 t2 = new MyThr1("Danny");
		MyThr1 t3 = new MyThr1("Harry");
		MyThr1 t4 = new MyThr1("Harry");
		MyThr1 t5 = new MyThr1();
		
		
	}
}
