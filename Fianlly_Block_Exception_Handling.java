
public class Fianlly_Block_Exception_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try{  
			   int data=25/0;  
			   System.out.println(data);  
			  }  
			  catch(NullPointerException e){System.out.println(e);} 
		  	  // Error doesnot handled because it is arithmetic error exception
			  finally{System.out.println("finally block ");}  
			  System.out.println("Error Handled");  
			  }  

}
