class MyThread implements Runnable {
String name;
Thread t;
    MyThread (String thread){
    name = thread; 
    t = new Thread(this, name);
System.out.println("New thread: " + t);
t.start();
}
 
 
public void run() {
 try {
     for(int i = 100; i > 0; i--) {
     System.out.print(name+" ");
      Thread.sleep(1000);
}
}catch (InterruptedException e) {
     System.out.println(name + "Interrupted");
}
     System.out.println(name + " exiting.");
}
}
 
class AssignmentQuestion5 {
public static void main(String args[]) {
     new MyThread("I");
     new MyThread("UPES");
     new MyThread("Love");
try {
     Thread.sleep(10000);
} catch (InterruptedException e) {
      System.out.println("Main thread Interrupted");
}
      System.out.println("Main thread exiting.");
      }
}
 