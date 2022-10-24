import java.io.*;
import java.util.*;

class C
{
	
	public int a=10;
	
	void f()
	{
		int a = 20;
		System.out.println(this.a+ "\n"+a);
	}
}
public class This_Demo {
	public static void main(String args[])
	{
		C o = new C();
		o.f();
		//Scanner s= new Scanner(System.in);
	}
}
