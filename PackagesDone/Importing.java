package PackagesDone;

import codewithharry.Gym.harryGym;
class Using extends harryGym{
    void meth2() {
        System.out.println(x);
        System.out.println(y);
		//System.out.println(z);
		//System.out.println(a);
    }
}

public class Importing{
    public static void main(String[] args) {
        System.out.println("This is importing");
        Using c = new Using();
        c.meth2();
        
    }
}