class Calculator
{
  int add(int a, int b)
  {
    return a+b;
  }
  int  add(int a, int b, int c)  
  {
    return a+b+c;
  }
  float add (float a, float b) {
	  return a+b;
  }
}
public class MethodOverloading {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
	    System.out.println("Addition of two operands is "+cal.add(10, 20));
	    System.out.println("Addition of three operands is "+cal.add(10, 20, 30));
	    System.out.println("Addition of 3 float values" + cal.add (10.3f, 12.5f));

	}

}
 