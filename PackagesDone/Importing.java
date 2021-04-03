import codewithharry.Gym.harryGym;

public class Importing{
    public static void main(String[] args) {
        System.out.println("This is importing");
        harryGym c = new harryGym();
        System.out.println(c.x);
        // We can't access the protected default and Private members
		// System.out.println(c.y);
		// System.out.println(c.z);
		//System.out.println(c.a);
        c.hey();
    }
}