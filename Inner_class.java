class Animal {
	
   private class Mammals {
      public void print() {
         System.out.println(" Whales ");
      }
   }
   
   void display() {
      Mammals M = new Mammals();
      M.print();
   }
}
   

public class Inner_class {



	public static void main(String[] args) {
 
	      Animal a = new Animal();
	      
	      // Accessing the display_Inner() method.
	      a.display();
		
	
	}

}
