interface  camera2 {
	void TakePic() ;
	void VideoRecord();
	
	private void greet() { // We can't override this method
		System.out.println("Hey Gems ");
	}
	
	default void RecordVideo() {    // We can override this  
		greet();
		System.out.println("Recording in 1040p");
	}
}

interface wifi2 {
	String[] getNetwork();
}

class MyPhone2{
	void callNumber(int phonenumber) {
		System.out.println("Calling..."+phonenumber);
	}
	
	void Pickcall(int number) {
		System.out.println("Incoming..."+number);
	}
}
class MySmartPhone2 extends MyPhone2 implements camera2,wifi2 {
public void TakePic() {
	System.out.println("Photo taken");
}

public void VideoRecord() {
	System.out.println("Video Recorded");
}
	
public String[] getNetwork() {
	System.out.println("Getting list of network");
	String[] list= {"Wifi 1","Hotspot 021478"};
	return list; 
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
