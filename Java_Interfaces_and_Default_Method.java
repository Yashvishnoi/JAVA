interface  camera {
	void TakePic() ;
	void VideoRecord();
}

interface wifi {
	String[] getNetwork();
}

class MyPhone{
	void callNumber(int phonenumber) {
		System.out.println("Calling..."+phonenumber);
	}
	
	void Pickcall(int number) {
		System.out.println("Incoming..."+number);
	}
}

public class Java_Interfaces_and_Default_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
