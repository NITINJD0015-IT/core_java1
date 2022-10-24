import java.io.*;

class A
{
	void show()
	{
		System.out.println("you are in class A");
	}
}

class B extends A
{
	void show()
	{
		super.show();
		System.out.println("you are in class B");
		
	}
}

public class MethodOverloadingDemo_RTP {
	
	public static void main(String args[])
	{
		
		/*A obj1 = new A();
		B obj2 = new B();
		
		A o;
		o = obj1;
		o.show();
	
		o = obj2;
		o.show();*/
		
		/*A o1,o2;
		o1 = new A();
		o2 = new B();
		o1.show();
		o2.show();*/
		
		
		B o = new B();
		
		o.show();
	}

}
