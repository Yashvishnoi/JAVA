class Add
{ 
	int a;
	int b;

	Add(int x,int y)
	{
		a=x;
		b=y;
	}
	void sum(Add A1) 
	{ 
		int addition=A1.a+A1.b;
		System.out.println("Sum of a and b :"+ addition);
	}
}

public class ObjectasParameter
{
	public static void main(String arg[])
	{ 
		Add A=new Add(5,8);
		A.sum(A);
	}
}