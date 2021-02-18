class ObjectReturn 
{ 
    int a; 
  
    ObjectReturn(int i) 
    { 
        a = i; 
    } 
  
    ObjectReturn increaseTen() 
    { 
        ObjectReturn temp = 
               new ObjectReturn(a+10); 
        return temp; 
    } 
} 
public class ReturningObject {

	public static void main(String[] args) {
		 ObjectReturn ob1 = new ObjectReturn(2); 
	     ObjectReturn ob2= ob1.increaseTen(); 
	  
	        System.out.println("ob1.a: " + ob1.a); 
	        System.out.println("ob2.a: " + ob2.a); 
	}

}
 
