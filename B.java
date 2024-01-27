package pack2;
import pack1.u3_3;
public class B
{
	public static void main(String args[])
	{
		u3_3 obj1=new u3_3();
		System.out.println("\n Instance Variable is:"+obj1.a);
		System.out.println("\n Instance Method Calling:");
		obj1.display();
	}
}
/*=>javac -d . u3_3.java

    java pack2.B

      Instance Variable is:10

      Instance Method Calling:
          class A of package pack1*/