class MyThr extends Thread{
	public MyThr(String name) {
		super(name);
	}
	public void run() {
		System.out.println("Hey, Well Done");
//		while(true) {
//			System.out.println("I am a thread");
//		}
	}
}
public class ThreadConstructor {

	public static void main(String[] args) {
		MyThr t = new MyThr("Harry");
		t.start();
		System.out.println("The id of the thread t is "+t.getId());
		System.out.println("The name of the thread t is "+t.getName());
	}
}
